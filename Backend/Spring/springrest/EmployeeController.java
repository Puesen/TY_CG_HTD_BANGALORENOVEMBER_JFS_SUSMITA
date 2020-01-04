package com.capgimini.springrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgimini.springrest.beans.EmployeeBean;
import com.capgimini.springrest.dto.EmployeeResponce;
import com.capgimini.springrest.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping(path = "/auth", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce auth(@RequestBody EmployeeBean bean) {
		EmployeeBean employeeBean= service.auth(bean.getEmail(), bean.getPassword());
		EmployeeResponce responce =new EmployeeResponce();
		if(employeeBean!=null) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDescription("Employee found for the credentials");
			responce.setBeans(Arrays.asList(employeeBean));

		}else 
		{
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("Credentials Invalid");
		}
		return responce;

	}

	@PostMapping(path = "/register", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce register(@RequestBody EmployeeBean bean) {
		EmployeeResponce responce =new EmployeeResponce();
		if(service.register(bean)) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDescription("Employee Registered");

		}else 
		{
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("Email already exist");
		}
		return responce;

	}


	@GetMapping(path = "/get", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce searchEmployee(@RequestParam("key") String key) {
		EmployeeResponce responce =new EmployeeResponce();
		List<EmployeeBean> beans =service.getEmployees(key);
		if(beans.isEmpty()) {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("Employee record not found");

		}else 
		{
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDescription("Employee record found");

		}
		return responce;
	}

	@PutMapping(path = "/change-password", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce changePassword(@RequestBody EmployeeBean bean) {
		EmployeeResponce responce =new EmployeeResponce();

		if(service.changePassword(bean.getId(),bean.getPassword())) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDescription("Password Changed");

		}else 
		{
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("Password not change");
		}
		return responce;

	}
	@DeleteMapping(path ="/delete/{id}" ,produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce deleteEmployee(@PathVariable("id")int id) {
		EmployeeResponce responce =new EmployeeResponce();
	service.deleteEmployee(id);
	responce.setStatusCode(201);
	responce.setMessage("Success");
	responce.setDescription("Employee Details Deleted");
	return responce;
	}


}
