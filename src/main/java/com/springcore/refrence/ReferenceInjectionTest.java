package com.springcore.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceInjectionTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("objConfig.xml");
		
		// Reference type injection
		A a = context.getBean("objA", A.class);
		B b = context.getBean("objB", B.class);
		System.out.println(a);
		System.out.println(b);
		
		((AbstractApplicationContext) context).close();
	}

}
