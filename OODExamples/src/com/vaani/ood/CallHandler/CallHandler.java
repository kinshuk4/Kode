package com.vaani.ood.CallHandler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("unchecked")
public class CallHandler {

	static  final int LEVEL = 3 ; 
	static  final int NUM_FRESH = 10 ; // freshers number
	    
	ArrayList<Employee>[] empLevels = new ArrayList[LEVEL]; // array[] of array list
	    
	Queue<Call>[] callq = new LinkedList[LEVEL] ; // array of queue list
	    
	public void getNextCall(Employee e) {
		// TODO Auto-generated method stub
		 for(int rank = e.rank -1 ;rank>=0;rank--)
	        {
	            Queue<Call> cq = callq[rank] ; // for correspondent wtih the same employee level call in queue list
	            Call c = cq.poll() ; // remove the first call ;
	            if (c!=null)
	            {
	                e.ReceiveCall(c);
	                return ;
	            }
	        }
	}

  
    public CallHandler()
    {
        ArrayList<Employee> fresherList = new ArrayList(NUM_FRESH ) ; // 10 new freshers LIST
        for ( int i =0 ; i < NUM_FRESH ; i ++ )
        {
            fresherList.add(new Fresher());
        }
        ArrayList<Employee> TLList = new ArrayList(1) ;
        TLList.add(new TL()) ;
        ArrayList<Employee> PMList = new ArrayList() ;
        PMList.add(new PM()) ;
        
        empLevels[0] = fresherList ;
        empLevels[1] = TLList ;
        empLevels[2] = PMList ;
    }
  
    public Employee getCallHandler(Call call)
    {
      for(int level = call.rank ; level <LEVEL-1 ; level++)
      {
          ArrayList<Employee> emplist = empLevels[level] ; // get it's level employeelist
          for (Employee e : emplist)
          {
              if(e.free)
                  return e ;
          }
      }
      return null ;
    }
    
    public void dispatch(Call call)
    {
       Employee em = getCallHandler(call) ; // get employee who can handle the call     
       if (em!=null)
           em.ReceiveCall(call);
       else
       {
           call.reply("Please wait for the available ") ;
           callq[call.rank].add(call) ; // add to waiting list call queue
       }     
             
    }   
}
