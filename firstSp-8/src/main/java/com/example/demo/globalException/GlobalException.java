package com.example.demo.globalException;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.example.demo.exception.StudentException;
import com.example.demo.model.MyError;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyError> handleStudentException(StudentException ex ,WebRequest req) {
		MyError error=new MyError(LocalDateTime.now(), ex.getMessage(), req.getDescription(false));
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyError> handleAnyEx(Exception msg,WebRequest req){
		MyError error=new MyError(LocalDateTime.now(),msg.getMessage(),req.getDescription(false));
		return new ResponseEntity<MyError>(error,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyError>InvalidReq(NoHandlerFoundException msg,WebRequest req){
		MyError error=new MyError(LocalDateTime.now(), msg.getMessage(),req.getDescription(false));
		return new ResponseEntity<MyError>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyError>ValidEx(MethodArgumentNotValidException msg){
		MyError error=new  MyError(LocalDateTime.now(), msg.getMessage(),msg.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<MyError>(error,HttpStatus.OK);
	}
}
