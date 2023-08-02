package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorConfig.xml");
		
//		Person p1 = context.getBean("person1", Person.class);
//		System.out.println(p1);

		Addition add = context.getBean("add", Addition.class);
		System.out.println(add);
		add.doSum();
		
		((AbstractApplicationContext) context).close();
	}

}
