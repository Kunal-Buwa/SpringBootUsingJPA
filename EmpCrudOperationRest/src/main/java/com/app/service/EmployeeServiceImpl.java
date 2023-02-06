package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public List<Employee> getAllEmpDetails() {
		
	
		return emprepo.findAll();
	}

	@Override
	public Employee addEmpDetails(Employee newemp) {
		// TODO Auto-generated method stub
		return emprepo.save(newemp);
	}

	@Override
	public String deleteEmpDetails(Long empid) {
		if(emprepo.existsById(empid)) {
		       emprepo.deleteById(empid);
		       return "Emp Details deleted";
		       
		}
		return "Deletion Failed :Invalid Emp Id";
		
	}

	@Override
	public Employee updateEmpDetails(Employee newupdate) {
		// TODO Auto-generated method stub
		return null;
	}

}
