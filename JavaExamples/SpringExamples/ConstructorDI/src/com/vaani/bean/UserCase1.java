package com.vaani.bean;

public class UserCase1 {
	  private String name;
	  private int age;
	  private String country;
	  public UserCase1( int age, String country) {
	    this.age=age;
	    this.country=country;
	  }
	  public UserCase1(String name, String country) {
	    this.name=name;
	    this.country=country;
	  }
	  
	  public String toString(){
		  return "Name "+name+" Age: "+age+" Country "+country;
	  }

}
