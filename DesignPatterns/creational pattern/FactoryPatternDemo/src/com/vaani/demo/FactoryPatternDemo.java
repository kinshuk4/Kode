package com.vaani.demo;

import com.vaani.factory.SalutationFactory;

public class FactoryPatternDemo{
	   public static void main(String args[]) {
	     SalutationFactory factory = new SalutationFactory();
	      factory.getPerson("Kinshuk", "M");
	    }
	}
