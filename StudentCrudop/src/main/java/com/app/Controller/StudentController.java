package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Student;
import com.app.service.studService;

@RestController

@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private  studService studservice;
	
	
	@GetMapping
	public List<Student>getAllEmps()
	{
		return studservice.getAllstudDetails();
	}
	@PostMapping
	public Student saveEmpDetails(@RequestBody Student newstud)
	{
		return studservice.addStudDetails(newstud);
	}
	@DeleteMapping("/{studid}")
	public String deleteEmpDetails(@PathVariable Long studid)
	{
		 studservice.updateStudDetails(studid);
		 return "deleted success";
	}
	@PutMapping
	public Student updatestudDetails(@RequestBody Student newupdate)
	{
		return studservice.updateStudDetails(newupdate);
	}

}
