package com.vaani.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaani.bean.UserCase1;
import com.vaani.bean.UserCase2;

public class IndexDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-case2.xml");
		UserCase2 eBean = (UserCase2)context.getBean("user");
		
		UserCase2 eBean2 = (UserCase2)context.getBean("user2");
		System.out.println(eBean);
		System.out.println(eBean2);

	}

}
