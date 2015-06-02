package com.vaani.demo;

import com.vaani.businesscode.BusinessService;
import com.vaani.dao.SomeDAO;
import com.vaani.threadlocal.MyThreadLocal;

public class ThreadLocalDemo extends Thread {
	 
    public static void main(String args[]) {
 
        Thread threadOne = new ThreadLocalDemo();
        threadOne.start();
 
        Thread threadTwo = new ThreadLocalDemo();
        threadTwo.start();
    }
 
    @Override
    public void run() {
        // sample code to simulate transaction id
    	SomeDAO dao = new SomeDAO();
        dao.setTransactionId(getName());
 
        // set the context object in thread local to access it somewhere else
        MyThreadLocal.set(dao);
 
        /* note that we are not explicitly passing the transaction id */
        new BusinessService().businessMethod();
        MyThreadLocal.unset();
 
    }
}