package com.vaani.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaani.bean.quizmaster.QuizMaster;
import com.vaani.services.QuizMasterServiceSpring;




public class SpringMain {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		QuizMasterServiceSpring quizMasterService = (QuizMasterServiceSpring) context.getBean("quizMasterService");

		quizMasterService.askQuestion();
	}


}
