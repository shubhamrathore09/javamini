package com.example.demo.model;

import java.time.LocalDateTime;

public class MyError {
	private LocalDateTime dateTime;
	private String msg;
	private String details;
	public MyError(LocalDateTime dateTime, String msg, String details) {
		super();
		this.dateTime = dateTime;
		this.msg = msg;
		this.details = details;
	}
	public MyError() {
		super();
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "MyError [dateTime=" + dateTime + ", msg=" + msg + ", details=" + details + "]";
	}
}
