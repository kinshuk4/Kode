package com.vaani.dao;

public class SomeDAO {
    private String transactionId = null;
    //some methods to deal with transaction
    public void setTransactionId(String transId)
    {
    	transactionId = transId;
    }
	public String getTransactionId() {
		return transactionId;
	}
    
}
