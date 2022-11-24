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
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee add(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAll() {
		return this.employeeRepository.findAll();
	}

	@Override
	public List<Employee> getAllByName(String name) {
		return this.employeeRepository.findByEmployeeName(name);
	}

	@Override
	public Employee getEmployeeByEmail(String email) {
		return this.employeeRepository.findByEmployeeEmail(email);
	}

	@Override
	public List<Employee> getEmployeeByDepartment(String departmentName) {
		return this.employeeRepository.findAllByDepartment_DepartmentCode(departmentName);
	}
}
