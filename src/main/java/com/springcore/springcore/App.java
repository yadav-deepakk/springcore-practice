package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springcore.refrence.A;
import com.springcore.springcore.refrence.B;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("empConfig.xml", "studentConfig.xml", "objConfig.xml");

		// primitive types injections
//		Student student1 = context.getBean("student1", Student.class);
//		Student student2 = context.getBean("student2", Student.class);
//		System.out.println(student1.toString());
//		System.out.println(student2.toString());

		
		// collection types injection
//		Employee e1 = context.getBean("employee1", Employee.class);
//		System.out.println(e1);
//		System.out.println(e1.getEmployeePhoneNumbers());
//		System.out.println(e1.getEmployeeAddresses());
//		System.out.println(e1.getCourses());
		
		// Reference type injection
		A a = context.getBean("objA", A.class);
		B b = context.getBean("objB", B.class);
		System.out.println(a);
		System.out.println(b);

		((AbstractApplicationContext) context).close();
	}
}
