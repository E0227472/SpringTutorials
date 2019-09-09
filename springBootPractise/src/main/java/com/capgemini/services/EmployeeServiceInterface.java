package com.capgemini.services;

import java.util.List;

import com.capgemini.beans.Product;

public interface EmployeeServiceInterface {

	// get all the records
	List<Product> getAllEmployees();

	// get 1 employee record by id
	Product getEmployeebyid(int id);

	// insert 1 employee record
	void addEmployee(Product e);

	// update 1 employee record
	void updateEmployee(int id, Product product);

	void deleteEmployee(int id);

}