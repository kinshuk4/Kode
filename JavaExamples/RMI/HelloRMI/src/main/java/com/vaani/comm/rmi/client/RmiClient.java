package com.vaani.comm.rmi.client;

import java.rmi.Naming;

import com.vaani.comm.rmi.server.IRmiServer;

public class RmiClient { 
    public static void main(String args[]) throws Exception {
        IRmiServer obj = (IRmiServer)Naming.lookup("//localhost/RmiServer");
        System.out.println(obj.getMessage()); 
    }
}