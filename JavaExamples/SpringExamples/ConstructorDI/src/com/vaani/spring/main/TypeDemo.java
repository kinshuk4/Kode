package com.vaani.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaani.bean.User;
import com.vaani.bean.UserCase1;

public class TypeDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-case1.xml");
		UserCase1 eBean = (UserCase1)context.getBean("user");
		
		UserCase1 eBean2 = (UserCase1)context.getBean("user2");
		System.out.println(eBean);
		System.out.println(eBean2);

	}
}
