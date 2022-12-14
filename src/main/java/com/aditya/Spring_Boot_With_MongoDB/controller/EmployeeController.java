/*
 * Author Name: Aditya Chaurasia
 * Date: 24-11-2022
 * Created With: IntelliJ IDEA Ultimate
 * Profile: github.com/ChaurasiaAditya
 * Website: ChaurasiaAditya.in
 */
package com.aditya.Spring_Boot_With_MongoDB.controller;

import com.aditya.Spring_Boot_With_MongoDB.domain.Employee;
import com.aditya.Spring_Boot_With_MongoDB.exeption.EmployeeAlreadyExist;
import com.aditya.Spring_Boot_With_MongoDB.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@PostMapping("add")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
		try {
			return new ResponseEntity<>(this.employeeService.add(employee), HttpStatus.CREATED);

		} catch (EmployeeAlreadyExist message) {
			throw new RuntimeException(message);
		}
	}

	@GetMapping("getall")
	public ResponseEntity<?> getALl() {
		return new ResponseEntity<>(this.employeeService.getAll(), HttpStatus.OK);
	}

	@GetMapping("getbyname/{name}")
	public ResponseEntity<?> getByName(@PathVariable String name) {
		return new ResponseEntity<>(this.employeeService.getAllByName(name), HttpStatus.OK);
	}

	@GetMapping("getbyemail/{email}")
	public ResponseEntity<?> getByEmail(@PathVariable String email) {
		return new ResponseEntity<>(this.employeeService.getEmployeeByEmail(email), HttpStatus.OK);
	}

	@GetMapping("getbydepartment/{department}")
	public ResponseEntity<?> getbydepartmentname(@PathVariable String department) {
		return new ResponseEntity<>(this.employeeService.getEmployeeByDepartment(department), HttpStatus.OK);
	}

}
