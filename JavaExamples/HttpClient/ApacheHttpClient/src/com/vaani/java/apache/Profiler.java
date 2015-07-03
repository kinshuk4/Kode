package com.vaani.java.apache;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.util.EntityUtils;

public class Profiler {
	public static final String url = "http://surya-interview.appspot.com/message";

	private static Map<String, String> getHeader;
	static {
		getHeader = new HashMap<String, String>();
		getHeader.put("X-Surya-Email-Id", "kinshuk.ram@gmail.com");

	}

	ApacheHttpClient client = new ApacheHttpClient();
	ApacheAsyncClient asyncClient = new ApacheAsyncClient();

	public long simpleProfile() throws ClientProtocolException, IOException {
		client  = new ApacheHttpClient();
		long startTime = System.nanoTime();

		HttpResponse response = client.get(url, getHeader, 0);
        HttpEntity entity = response.getEntity();
        
        if(response!=null){
        String jsonBody = "";
		if (entity != null)
			jsonBody = EntityUtils.toString(response.getEntity());
		System.out.println(jsonBody);
		
			response = client.post(url, jsonBody);
			System.out.println(response);
        }

		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		client.close();
		return duration;
	}
	
	public long asyncProfile() throws ClientProtocolException, IOException {
		long startTime = System.nanoTime();

		HttpResponse response = client.get(url, getHeader, 0);
        HttpEntity entity = response.getEntity();
        
        if(response!=null){
        String jsonBody = "";
		if (entity != null)
			jsonBody = EntityUtils.toString(response.getEntity());
		System.out.println(jsonBody);
		
			response = client.post(url, jsonBody);
			System.out.println(response);
        }

		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		return duration;
	}
	
	
}
