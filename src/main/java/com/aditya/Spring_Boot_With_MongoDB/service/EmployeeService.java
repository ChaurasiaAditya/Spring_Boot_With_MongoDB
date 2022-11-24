package com.aditya.Spring_Boot_With_MongoDB.service;

import com.aditya.Spring_Boot_With_MongoDB.domain.Employee;

import java.util.List;

public interface EmployeeService {
	Employee add(Employee employee);

	List<Employee> getAll();

	List<Employee> getAllByName(String name);

	Employee getEmployeeByEmail(String email);

	List<Employee> getEmployeeByDepartment(String departmentName);
}
