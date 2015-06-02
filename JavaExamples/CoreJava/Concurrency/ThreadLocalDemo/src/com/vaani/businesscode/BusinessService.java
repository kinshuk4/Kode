package com.vaani.businesscode;

import com.vaani.dao.SomeDAO;
import com.vaani.threadlocal.MyThreadLocal;

public class BusinessService {
	 
    public void businessMethod() {
        // get the context from thread local
        SomeDAO dao = MyThreadLocal.get();
        System.out.println(dao.getTransactionId());
    }
}