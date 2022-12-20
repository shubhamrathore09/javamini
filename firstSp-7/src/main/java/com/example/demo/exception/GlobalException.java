package com.example.demo.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.Student.MyErrorDetails;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> ex(Exception ie,WebRequest req){
		MyErrorDetails obj=new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(obj,HttpStatus.BAD_REQUEST);
	}
}


