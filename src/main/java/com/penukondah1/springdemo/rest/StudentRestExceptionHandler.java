package com.penukondah1.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice 
/*A controller advice allows you to use exactly the same exception handling techniques 
 *but apply them across the whole application, not just to an individual controller. */ 
public class StudentRestExceptionHandler {
	
	// add exception handling code here
	
	// Add an exception handler using @ExceptionHandler
	@ExceptionHandler // This method is an exception handler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) // StudentErrorResponse --> Type of the response body, StudentNotFoundException --> Exception type to handle/catch
	{
			
			// create a StudentErrorResponse
			StudentErrorResponse error = new StudentErrorResponse();
			error.setStatus(HttpStatus.NOT_FOUND.value());
			error.setMessage(exc.getMessage());
			error.setTimeStamp(System.currentTimeMillis());
			
			// return Response
			return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
		
	// add another exception handler... to catch any exception (catch all)
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(Exception exc)
		{
			// create a StudentErrorResponse
			StudentErrorResponse error = new StudentErrorResponse();
			error.setStatus(HttpStatus.BAD_REQUEST.value());
			error.setMessage(exc.getMessage());
			error.setTimeStamp(System.currentTimeMillis());
			
			// return Response
			return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
			
		}

}
