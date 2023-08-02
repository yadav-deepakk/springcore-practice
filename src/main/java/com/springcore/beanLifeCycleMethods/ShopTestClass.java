package com.springcore.beanLifeCycleMethods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopTestClass {

	public static void main(String[] args) {
		String filePath = "com/springcore/beanLifeCycleMethods/lifeCycleMethodsConfig.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(filePath);
		
		Shop shop1 = context.getBean("shop1", Shop.class);
		System.out.println(shop1);
				
		context.close();
	}

}
