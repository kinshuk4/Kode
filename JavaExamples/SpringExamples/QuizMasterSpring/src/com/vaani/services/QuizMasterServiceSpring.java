package com.vaani.services;

import com.vaani.bean.quizmaster.QuizMaster;

public class QuizMasterServiceSpring {

	   QuizMaster quizMaster;
	    
	   public void setQuizMaster(QuizMaster quizMaster) {
	       this.quizMaster = quizMaster;
	     }
	   
	    public void askQuestion()
	    {
	        System.out.println(quizMaster.popQuestion());
	    }
	}

