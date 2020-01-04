package com.capgimini.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgimini.springrest.dto.EmployeeResponce;
import com.capgimini.springrest.exception.EmployeeException;

@RestControllerAdvice
public class EmployeeControllerAdvice {
	@ExceptionHandler(EmployeeException.class)
	public EmployeeResponce handleEmployeeException(EmployeeException e) {
		EmployeeResponce responce =new EmployeeResponce();
		responce.setStatusCode(501);
		responce.setMessage("Exception");
		responce.setMessage(e.getMessage());
		return null;
		
	}

}
