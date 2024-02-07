package com.employee.service;

import java.util.List;

import com.employee.exceptions.EmployeeException;
import com.employee.model.Employee;
import com.employee.model.EmployeeDto;

public interface EmployeeService {
	
	public List<EmployeeDto> findAll();
	
	public EmployeeDto saveEmployee(EmployeeDto employeeDto);


	public EmployeeDto update(Integer id, EmployeeDto employeeDto)throws EmployeeException;
	public Employee getEmployeeById(Integer id)throws EmployeeException;
	
	public void deleteEmployeeById(Integer id)throws EmployeeException;
}
