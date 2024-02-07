package com.employee.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeException extends Exception{
	
	public EmployeeException() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeException(String msg) {
		super(msg);
	}

	public EmployeeException(Integer id) {
		super(String.format("employee with name %s not found in the system.", id));
	}
}
