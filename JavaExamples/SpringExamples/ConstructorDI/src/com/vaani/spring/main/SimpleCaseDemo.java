package com.vaani.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaani.bean.User;

public class SimpleCaseDemo {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		User eBean = (User)context.getBean("user");
		System.out.println(eBean);

	}
}

