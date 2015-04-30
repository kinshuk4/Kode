package com.vaani.bean;

public class ExampleBean {
	AnotherBean bean;
	
	public void setAnotherBean(AnotherBean b){
		bean = b;
	}
	
	public String getMessage()
	{
		return bean.getMessage();
	}
}
