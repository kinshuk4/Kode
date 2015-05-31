package com.vaani.oops.interfaces;

public class TestOffice {

	public static void main(String[] args) {
		Office obj = new Word();
		obj.appOpen("xyz.doc");
		obj.appSave("xyz.doc");
		obj = new Excel();
		obj.appOpen("data.xls");
		obj.appSave("data.xls");
	}
}
