package com.vaani.threadlocal;

import com.vaani.dao.SomeDAO;

public class MyThreadLocal {
	 
    public static final ThreadLocal userThreadLocal = new ThreadLocal();
 
    public static void set(SomeDAO dao) {
        userThreadLocal.set(dao);
    }
 
    public static void unset() {
        userThreadLocal.remove();
    }
 
    public static SomeDAO get() {
        return (SomeDAO)userThreadLocal.get();
    }
}