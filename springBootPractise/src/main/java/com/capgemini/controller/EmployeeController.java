package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.beans.Product;
import com.capgemini.services.EmployeeServiceInterface;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeServiceInterface serviceimpl;
	
	@RequestMapping("/employees")
	public List<Product> getAllEmployees(){
		return serviceimpl.getAllEmployees();
	}
	
	@RequestMapping("/employees/{id}")
	public Product getEmployee(@PathVariable int id){
		return serviceimpl.getEmployeebyid(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/employees")
	public void addTopic(@RequestBody Product e)
	{
		serviceimpl.addEmployee(e);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/employees/{id}")
	public void updateEmployee(@RequestBody Product e,@PathVariable int id )
	{
		serviceimpl.updateEmployee(id, e);
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/employees/{id}")
	public void deleteEmployee(@PathVariable int id )
	{
		serviceimpl.deleteEmployee(id);
	}
	
}
