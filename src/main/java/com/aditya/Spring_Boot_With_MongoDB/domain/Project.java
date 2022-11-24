/*
 * Author Name: Aditya Chaurasia
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Ultimate
 * Profile: github.com/ChaurasiaAditya
 * Website: ChaurasiaAditya.in
 */
package com.aditya.Spring_Boot_With_MongoDB.domain;

public class Project {
	private  int projectCode;
	private String projectName;
	private int durationInMonth;

	public Project() {
	}

	public Project(int projectCode, String projectName, int durationInMonth) {
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.durationInMonth = durationInMonth;
	}

	public int getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(int projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getDurationInMonth() {
		return durationInMonth;
	}

	public void setDurationInMonth(int durationInMonth) {
		this.durationInMonth = durationInMonth;
	}

	@Override
	public String toString() {
		return "Project{" +
			"projectCode=" + projectCode +
			", projectName='" + projectName + '\'' +
			", durationInMonth=" + durationInMonth +
			'}';
	}
}
