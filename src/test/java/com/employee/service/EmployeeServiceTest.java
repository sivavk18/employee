///*
//package com.employee.service;
//
//import com.employee.builders.EmployeeDtoBuilder;
//import com.employee.mappers.EmployeeMapper;
//import com.employee.model.Employee;
//import com.employee.model.EmployeeDto;
//import com.employee.repository.EmployeeRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.mockito.junit.jupiter.MockitoSettings;
//import org.mockito.quality.Strictness;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.ContextConfiguration;
//
//import java.util.Collections;
//import java.util.List;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//@MockitoSettings(strictness = Strictness.LENIENT)
//public class EmployeeServiceTest {
//    @InjectMocks
//    public EmployeeServiceImpl employeeService;
//    @Mock
//    private EmployeeRepository employeeRepo;
//    @Mock
//    private EmployeeMapper employeeMapper =EmployeeMapper.INSTANCE;
//
//    @Test
//    void whenEmployeeIsCreated(){
//
//        EmployeeDto ExpectedEmployeeDto =EmployeeDtoBuilder.builder().build().employeeDtos();
//        Employee expectedEmployee =employeeMapper.toModel(ExpectedEmployeeDto);
//        Mockito.when(employeeRepo.save(expectedEmployee)).thenReturn(expectedEmployee);
//        EmployeeDto createdEmployee =employeeService.saveEmployee(ExpectedEmployeeDto);
//        assertEquals(createdEmployee.getFirstName(), (ExpectedEmployeeDto.getFirstName()));
//        assertEquals(createdEmployee.getLastName(), (ExpectedEmployeeDto.getLastName()));
//        assertEquals(createdEmployee.getEmail(), (ExpectedEmployeeDto.getEmail()));
//        assertEquals(createdEmployee.getId(), (ExpectedEmployeeDto.getId()));
//        Mockito.verify(employeeRepo, Mockito.times(1)).save(expectedEmployee);
//    }
//
//    @Test
//    void whenListEmployeeIsCalledThenReturnAListOfEmployee(){
//        EmployeeDto ExpectedEmployeeDto =EmployeeDtoBuilder.builder().build().employeeDtos();
//        Employee expectedEmployee =employeeMapper.toModel(ExpectedEmployeeDto);
//        when(employeeRepo.findAll()).thenReturn(Collections.singletonList(expectedEmployee));
//        List<EmployeeDto> foundListEmployeeDTO = employeeService.findAll();
//        assertThat(foundListEmployeeDTO, is(not(empty())));
//        assertThat(foundListEmployeeDTO.get(0), is(equalTo(ExpectedEmployeeDto)));
//
//    }
//
//}
//*/
