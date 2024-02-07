package com.employee.mappers;

import com.employee.model.Employee;
import com.employee.model.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    Employee toModel(EmployeeDto employeeDto);
    EmployeeDto toDto(Employee employee);
}
