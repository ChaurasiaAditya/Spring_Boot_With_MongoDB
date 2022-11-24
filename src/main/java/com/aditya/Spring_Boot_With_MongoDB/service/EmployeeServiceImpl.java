/*
 * Author Name: Aditya Chaurasia
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Ultimate
 * Profile: github.com/ChaurasiaAditya
 * Website: ChaurasiaAditya.in
 */
package com.aditya.Spring_Boot_With_MongoDB.service;

import com.aditya.Spring_Boot_With_MongoDB.domain.Employee;
import com.aditya.Spring_Boot_With_MongoDB.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee add(Employee employee) {
		return null;
	}

	@Override
	public List<Employee> getAll() {
		return null;
	}

	@Override
	public List<Employee> getAllByName(String name) {
		return null;
	}

	@Override
	public Employee getEmployeeByEmail(String email) {
		return null;
	}

	@Override
	public List<Employee> getEmployeeByDepartment(String departmentName) {
		return null;
	}
}
