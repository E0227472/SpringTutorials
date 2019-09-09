package com.capgemini.beans;

import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean {
	private int employeeNumber;
	private String name;
	private Map<String,Address> address;
	
	public Map<String, Address> getAddress() {
		return address;
	}
	public void setAddress(Map<String, Address> address) {
		this.address = address;
	}
	private Employee () {
		System.out.println("Employee constructor is invoked");
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("From destroy method");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from afterPropertiesSet method");
		
	}
	

}
