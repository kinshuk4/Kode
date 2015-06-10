package com.vaani.comm.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
 
public interface IRmiServer extends Remote {
    public String getMessage() throws RemoteException;
}
