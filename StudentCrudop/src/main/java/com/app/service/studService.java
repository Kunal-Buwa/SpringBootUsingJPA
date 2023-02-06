package com.app.service;

import java.util.List;


import com.app.pojos.Student;

public interface studService
{
	List<Student> getAllstudDetails();
	Student addStudDetails(Student newstud);
	String deleteStudDetails(Long studid);
	Student updateStudDetails(Long studid);
	Student updateStudDetails(Student newupdate);
}
