package com.vaani.bean;

public class User{
	  private String name;
	  private int age;
	  private String country;
	  public User( String name, int age) {
	     this.name=name;
	     this.age=age;
	  }
	  public String toString() {
	     return name+" "+age;
	  }
	}

