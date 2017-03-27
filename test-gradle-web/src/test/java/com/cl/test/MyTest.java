package com.cl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dubbo.service.UserService;


public class MyTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:*.xml" });
		UserService service = (UserService) context.getBean("userService");
		System.out.println(service.sayHello());
	}
}
