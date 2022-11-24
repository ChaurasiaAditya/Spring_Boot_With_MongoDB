package com.aditya.Spring_Boot_With_MongoDB.service;

import com.aditya.Spring_Boot_With_MongoDB.domain.Employee;
import com.aditya.Spring_Boot_With_MongoDB.exeption.EmployeeAlreadyExist;

import java.util.List;

public interface EmployeeService {
	Employee add(Employee employee) throws EmployeeAlreadyExist;

	List<Employee> getAll();

	List<Employee> getAllByName(String name);

	Employee getEmployeeByEmail(String email);

	List<Employee> getEmployeeByDepartment(String departmentName);
}
