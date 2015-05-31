package com.vaani.oops.interfaces;

public class Word implements Office {

	public void appNew(String fileName) {
		System.out.println("Word opening New file "+ fileName);		
	}

	public void appOpen(String fileName) {
		System.out.println("Word opening file "+ fileName);		
	}

	public void appSave(String fileName) {
		System.out.println("Word saving file "+ fileName);
	}
}
