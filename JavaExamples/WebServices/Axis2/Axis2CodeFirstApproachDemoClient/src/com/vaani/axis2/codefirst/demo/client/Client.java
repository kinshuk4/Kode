package com.vaani.axis2.codefirst.demo.client;

import java.rmi.RemoteException;

import com.vaani.axis2.codefirst.demo.SimpleCalculatorServiceStub;
import com.vaani.axis2.codefirst.demo.SimpleCalculatorServiceStub.Multiply;
import com.vaani.axis2.codefirst.demo.SimpleCalculatorServiceStub.MultiplyResponse;
 
public class Client {  
    public static void main(String[] args) throws RemoteException {
    	SimpleCalculatorServiceStub stub = new SimpleCalculatorServiceStub();
    	Multiply request = new Multiply();
    	request.setIn0(10);
    	request.setIn1(15);
    	
        MultiplyResponse  response = stub.multiply(request);
        System.out.println(response.getMultiplyReturn());
    	
	}
} 