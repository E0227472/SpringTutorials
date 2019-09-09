package com.capgemini.view;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		applicationContext.registerShutdownHook();
		
		System.out.println("After application context container");
		Employee employee = applicationContext.getBean("Employee", Employee.class);

		System.out.println(employee.getEmployeeNumber());

		System.out.println(employee.getName());

		Map<String, Address> address = employee.getAddress();

		System.out.println(address.get("1").getCity());
		System.out.println(address.get("2").getCity());
	}
}
