package com.vaani.java.apache;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public class AsyncCallRunner {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		Profiler pro = new Profiler();
		System.out.println(pro.simpleProfile());
	}
}
