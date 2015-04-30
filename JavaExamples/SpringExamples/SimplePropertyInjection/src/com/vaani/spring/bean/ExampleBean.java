package com.vaani.spring.bean;


public class ExampleBean
{
  private String s;
  private int i;

  public void setStringProperty(String s) { this.s = s; }
  public void setIntegerProperty(int i) { this.i = i; }
  
  public String toString()
  {
	  return s+" "+i;
  }
}
