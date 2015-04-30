package com.vaani.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaani.bean.ExampleBean;



public class ReferringBeansDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ExampleBean eBean = (ExampleBean)context.getBean("exampleBean");
		System.out.println(eBean.getMessage());

	}

}
