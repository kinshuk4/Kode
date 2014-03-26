package com.vaani.ood.CallHandler;

public class Employee
{
    public int rank ; // 0-fresh , 1 - TL, 2 -PM
    Employee(int rank)
    {
        this.rank = rank ;
    }
    boolean free ;
    CallHandler callhandler ;
    
    void ReceiveCall(Call call)
    {
        free = false ;
    }
    void HandledCall(Call call)
    {
        call.disconnect() ;
        free = true ;
        // look for next call 
        callhandler.getNextCall(this) ;
    }
    //if issue can't be solved 
    void cannotHandleCall(Call call )
    {
        call.rank =call.rank+1 ;
        callhandler.dispatch(call) ;
        free = true ; // release to be free 
        callhandler.getNextCall(this) ;
    }
    
}