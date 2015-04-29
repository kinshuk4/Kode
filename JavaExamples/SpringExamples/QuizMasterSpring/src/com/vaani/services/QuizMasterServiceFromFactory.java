package com.vaani.services;

import com.vaani.bean.quizmaster.QuizMaster;

//Note no dependency on individual implementations
//like SpringQuizMaster
public class QuizMasterServiceFromFactory {

	   QuizMaster quizMaster;
	    
	   public void setQuizMaster(QuizMaster quizMaster) {
	       this.quizMaster = quizMaster;
	     }
	   
	    public void askQuestion()
	    {
	        System.out.println(quizMaster.popQuestion());
	    }
	}

