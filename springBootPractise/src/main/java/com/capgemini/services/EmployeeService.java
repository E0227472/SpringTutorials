package com.capgemini.services;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.beans.Product;
@Service
public class EmployeeService implements EmployeeServiceInterface {

	private List<Product> emp = new ArrayList<>(Arrays.asList(new Product(1, "name1", "role1"),
			new Product(2, "name2", "role2"), new Product(3, "name3", "role3")));

	// get all the records
	/* (non-Javadoc)
	 * @see com.capgemini.services.EmployeeServiceInterface#getAllEmployees()
	 */
	@Override
	public List<Product> getAllEmployees() {
		return emp;
	}

	// get 1 employee record by id
	/* (non-Javadoc)
	 * @see com.capgemini.services.EmployeeServiceInterface#getEmployeebyid(java.lang.String)
	 */
	@Override
	public Product getEmployeebyid(int id) {
		return emp.stream().filter(t->t.getId()==id).findFirst().get();
	}

	// insert 1 employee record
	/* (non-Javadoc)
	 * @see com.capgemini.services.EmployeeServiceInterface#addEmployee(com.capgemini.beans.Product)
	 */
	@Override
	public void addEmployee(Product e) {
		emp.add(e);
	}

	// update 1 employee record
	/* (non-Javadoc)
	 * @see com.capgemini.services.EmployeeServiceInterface#updateEmployee(java.lang.String, com.capgemini.beans.Product)
	 */
	@Override
	public void updateEmployee(int id, Product product) {
		for(int i = 0; i<emp.size(); i++) {
			Product e = emp.get(i);
			if(e.getId()==id) {
				emp.set(i, product);
				return;
			}
			
		}
	}


	/* (non-Javadoc)
	 * @see com.capgemini.services.EmployeeServiceInterface#deleteEmployee(java.lang.String)
	 */
	@Override
	public void deleteEmployee(int id) {
		emp.removeIf(t -> t.getId() == id);
		
	}




}

