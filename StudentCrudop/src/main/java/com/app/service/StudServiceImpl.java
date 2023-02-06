package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Student;
import com.app.repository.Studrepo;
@Service
@Transactional
public class StudServiceImpl implements studService
{
@Autowired
private Studrepo  stud;

	@Override
	public List<Student> getAllstudDetails() {
		
		return stud.findAll();
	}

	@Override
	public Student addStudDetails(Student newstud) {
		
		return stud.save(newstud);
	}

	@Override
	public String deleteStudDetails(Long studid) {
		
		 stud.deleteById(studid);
		 return "deleted succesfully";
	}

	@Override
	public Student updateStudDetails(Student newupdate) {
	
		return stud.save(newupdate);
	}

	@Override
	public Student updateStudDetails(Long studid) {
		// TODO Auto-generated method stub
		return null;
	}

}
