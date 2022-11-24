/*
 * Author Name: Aditya Chaurasia
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Ultimate
 * Profile: github.com/ChaurasiaAditya
 * Website: ChaurasiaAditya.in
 */
package com.aditya.Spring_Boot_With_MongoDB.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document
public class Employee {

	@MongoId
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

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee{" +
			"employeeCode=" + employeeCode +
			", employeeName='" + employeeName + '\'' +
			", employeeEmail='" + employeeEmail + '\'' +
			", department=" + department +
			", projects=" + projects +
			'}';
	}
}
