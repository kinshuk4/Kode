package com.vaani.main;

import com.vaani.bean.quizmaster.QuizMaster;
import com.vaani.bean.quizmaster.factory.QuizMasterFactory;
import com.vaani.services.QuizMasterServiceCoupled;
import com.vaani.services.QuizMasterServiceFromFactory;
//how tightly coupled it is, without spring
public class QuizProgramFrmFactory {
	 
    public static void main(String[] args) {
    	QuizMaster quizMaster = QuizMasterFactory.getQuizMaster("Spring");
        QuizMasterServiceFromFactory quizMasterService = new QuizMasterServiceFromFactory();
        quizMasterService.setQuizMaster(quizMaster);
        
        quizMasterService.askQuestion();
    }
 
}