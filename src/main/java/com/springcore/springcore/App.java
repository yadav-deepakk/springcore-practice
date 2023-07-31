package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.refrence.A;
import com.springcore.refrence.B;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("empConfig.xml", "studentConfig.xml");

		// primitive types injections
		Student student1 = context.getBean("student1", Student.class);
		Student student2 = context.getBean("student2", Student.class);
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		
		System.out.println();
		
		// collection types injection
		Employee e1 = context.getBean("employee1", Employee.class);
		System.out.println(e1);
		System.out.println(e1.getEmployeePhoneNumbers());
		System.out.println(e1.getEmployeeAddresses());
		System.out.println(e1.getCourses());
		

		((AbstractApplicationContext) context).close();
	}
}
