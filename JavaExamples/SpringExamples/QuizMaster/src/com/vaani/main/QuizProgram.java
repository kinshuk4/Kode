package com.vaani.main;

import com.vaani.services.QuizMasterServiceCoupled;
//how tightly coupled it is, without spring
public class QuizProgram {
	 
    public static void main(String[] args) {
        QuizMasterServiceCoupled quizMasterService = new QuizMasterServiceCoupled();
        quizMasterService.askQuestion();
    }
 
}