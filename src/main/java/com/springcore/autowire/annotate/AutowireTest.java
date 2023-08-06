package com.springcore.autowire.annotate;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {

	public static void main(String[] args) {
		String xmlFilePath = "com/springcore/autowire/annotate/autowireAnnotateConfig.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(xmlFilePath);
		
		Employee employee1 = context.getBean("employee1", Employee.class);
		System.out.println(employee1);
		
		context.close();
	}

}
