package com.vaani.bean.quizmaster.factory;

import com.vaani.bean.quizmaster.QuizMaster;
import com.vaani.bean.quizmaster.SpringQuizMaster;
import com.vaani.bean.quizmaster.StrutsQuizMaster;

public class QuizMasterFactory {
	public static QuizMaster getQuizMaster(String subject)
	{
		if("Spring".equals(subject))
			return new SpringQuizMaster();
		else if("Struts".equals(subject))
			return new StrutsQuizMaster();
		else
			throw new IllegalArgumentException("No subject exists with name "+subject);
	}
}
