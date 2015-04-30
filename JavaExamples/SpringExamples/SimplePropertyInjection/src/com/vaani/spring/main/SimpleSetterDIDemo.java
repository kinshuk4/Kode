package com.vaani.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaani.spring.bean.ExampleBean;

public class SimpleSetterDIDemo {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ExampleBean eBean = (ExampleBean)context.getBean("exampleBean");
		System.out.println(eBean);

	}
}

