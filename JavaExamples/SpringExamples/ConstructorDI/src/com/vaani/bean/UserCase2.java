package com.vaani.bean;

public class UserCase2 {

	String name;
	int age;
	String country;
	public UserCase2(String name, int age)
	{
	  this.name=name;
	  this.age=age;
	}
	public UserCase2( int age, String country)
	{
	  this.age=age;
	  this.country=country;
	}
	
	public String toString(){
		  return "Name "+name+" Age: "+age+" Country "+country;
	  }


}
