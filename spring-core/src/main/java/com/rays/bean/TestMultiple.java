package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultiple {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Multiple.xml");
		UserBean user =  (UserBean) context.getBean("user");
		Person person = context.getBean(Person.class);
		
		System.out.println(user.getLogin());
		System.out.println(user.getPassword());
		System.out.println(person.getName());
	}

}
