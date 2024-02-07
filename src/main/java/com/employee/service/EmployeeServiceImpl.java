package com.employee.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.employee.mappers.EmployeeMapper;
import com.employee.model.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.exceptions.EmployeeException;
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class  EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private  EmployeeRepository employeeRepository;


	private final EmployeeMapper employeeMapper =EmployeeMapper.INSTANCE;
	@Override
	public List<EmployeeDto> findAll() {
		return employeeRepository.findAll().stream().map(employeeMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		Employee employee = employeeMapper.toModel(employeeDto);
		Employee saved =employeeRepository.save(employee);
		return employeeMapper.toDto(saved);
	}

	@Override
	public EmployeeDto update(Integer id, EmployeeDto employeeDto) throws EmployeeException {
		Employee employee1 = employeeRepository.findById(id).orElseThrow(()-> new EmployeeException(id));
		employee1.setId(employeeDto.getId());
		employee1.setEmail(employeeDto.getEmail());
		employee1.setFirstName(employeeDto.getFirstName());
		employee1.setLastName(employeeDto.getLastName());
		Employee updatePro= employeeRepository.save(employee1);
		return employeeMapper.toDto(updatePro);
	}

	@Override
	public Employee getEmployeeById(Integer id) throws EmployeeException {
		return employeeRepository.findById(id).orElseThrow(()-> new EmployeeException(id));
	}

	@Override
	public void deleteEmployeeById(Integer id) throws EmployeeException {
		 employeeRepository.findById(id).orElseThrow(()-> new EmployeeException(id));
		employeeRepository.deleteById(id);
	}
}
