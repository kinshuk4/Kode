package com.vaani.services;

import com.vaani.bean.quizmaster.QuizMaster;
import com.vaani.bean.quizmaster.SpringQuizMaster;

public class QuizMasterServiceCoupled {

	  private QuizMaster quizMaster = new SpringQuizMaster();
	   
	  public void askQuestion()
	  {
	       System.out.println(quizMaster.popQuestion());
	  }
	}