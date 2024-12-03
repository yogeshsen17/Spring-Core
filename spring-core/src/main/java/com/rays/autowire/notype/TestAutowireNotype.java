package com.rays.autowire.notype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireNotype {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Autowire-Notype.xml");

		UserService userService = (UserService) context.getBean("userService");
		userService.testAdd();
	}

}
