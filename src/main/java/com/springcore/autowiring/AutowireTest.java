package com.springcore.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {

	public static void main(String[] args) {
		String xmlFilePath = "com/springcore/autowiring/autowireConfig.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(xmlFilePath);
		
		Employee employee1 = context.getBean("employee1", Employee.class);
		System.out.println(employee1);
		
		context.close();
	}

}
