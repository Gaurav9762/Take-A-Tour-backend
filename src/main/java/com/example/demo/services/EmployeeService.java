package com.example.demo.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.AddressRepository;
import com.example.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService 
{
	  @Autowired
	  EmployeeRepository emprepo;
	  
	  
	  public Employee getEmpInfo(int id)
	  {
		  
		  
		  Optional<Employee> emp= emprepo.findById(id);
		  
		  Employee ep = null;
			try
			{
				ep = emp.get();
			}
			catch(NoSuchElementException e)
			{
				ep = null;
			}
			
			return ep;	  
	  }
	  		

}
