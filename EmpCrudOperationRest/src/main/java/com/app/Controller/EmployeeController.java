package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@RestController

@RequestMapping("/employees")
public class EmployeeController 
{
	@Autowired
	private  EmployeeService empservice;
	
	
	@GetMapping
	public List<Employee>getAllEmps()
	{
		return empservice.getAllEmpDetails();
	}
	@PostMapping
	public Employee saveEmpDetails(@RequestBody Employee newemp)
	{
		return empservice.addEmpDetails(newemp);
	}
	@DeleteMapping("/{empid}")
	public String deleteEmpDetails(@PathVariable Long empid)
	{
		return empservice.deleteEmpDetails(empid);
	}
	@PutMapping
	public Employee updateEmpDetails(@RequestBody Employee newupdate)
	{
		return empservice.updateEmpDetails(newupdate);
	}
	
	

}
