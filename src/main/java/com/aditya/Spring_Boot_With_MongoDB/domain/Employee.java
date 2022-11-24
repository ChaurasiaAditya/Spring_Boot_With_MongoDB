/*
 * Author Name: Aditya Chaurasia
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Ultimate
 * Profile: github.com/ChaurasiaAditya
 * Website: ChaurasiaAditya.in
 */
package com.aditya.Spring_Boot_With_MongoDB.domain;

import java.util.List;

public class Employee {
	private int employeeCode;
	private String employeeName;
	private String employeeEmail;
	private Department department;
	private List<Project> projects;

	public Employee() {
	}

	public Employee(int employeeCode, String employeeName, String employeeEmail, Department department, List<Project> projects) {
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.department = department;
		this.projects = projects;
	}
}
