package com.springcore.beanLifeCycleMethods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMenthodTest {

	public static void main(String[] args) {
		String filePath = "com/springcore/beanLifeCycleMethods/lifeCycleMethodsConfig.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(filePath);

//		ShopBean shop1 = context.getBean("shop1", ShopBean.class);
//		System.out.println(shop1);

//		Car tyotaFortuner = context.getBean("tyotaFortuner", Car.class);
//		System.out.println(tyotaFortuner);
		
		Bicycle hercules = context.getBean("hercules", Bicycle.class);
		System.out.println(hercules);

		context.close();
	}

}
