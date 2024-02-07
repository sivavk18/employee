package com.employee.controller;

import java.util.List;
import com.employee.model.EmployeeDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.employee.exceptions.EmployeeException;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	
	@PostMapping("/saveEmployee")
	@ResponseStatus(HttpStatus.CREATED)
	public EmployeeDto saveEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
		return employeeService.saveEmployee(employeeDto);
	}
	
	@GetMapping("/employee")
	public List<EmployeeDto> findAll() {
		return employeeService.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) throws EmployeeException {
		return employeeService.getEmployeeById(id);
	}
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteEmployeeById(@PathVariable Integer id)throws EmployeeException{
		employeeService.deleteEmployeeById(id);
	}
	@PutMapping("/employee/{id}")
	@ResponseStatus(HttpStatus.OK)
	public EmployeeDto update(@RequestBody @Valid EmployeeDto employeeDto ,@PathVariable Integer id )throws EmployeeException{
		return employeeService.update(id,employeeDto);
	}
}
