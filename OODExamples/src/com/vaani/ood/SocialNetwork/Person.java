package com.vaani.ood.SocialNetwork;

import java.util.ArrayList;

public class Person {
    private String info ; // person information 
    private int ID ;
    private ArrayList<Integer> friendList ; // use Friend ID Friends List 
    private int MachineID ; // person store in which machine 
    private Server server = new Server() ;
    
    public Person(String inform, int PID , int machineID )
    {
        this.info = inform ;
        this.ID = PID ;
        this.MachineID = machineID ;
    }
    public void setPeronInform(String inform)
    {
        this.info = inform ;
    }
    public void setPersonID(int ID)
    {
        this.ID = ID ;
    }
    public void addToFreindList(int FreindID)
    {
        friendList.add(FreindID) ;
    }
    public int getPersonID ()
    {
        return ID ; 
    }
    public String getPersonInform()
    {
        return info ;
    }
    public int getItsMachineID()
    {
        return MachineID ;
    }
    
    public int[] getFriendList() // get friendID from the freindList
    {
        int[] temp = new int[friendList.size()] ;
        for(int i = 0 ; i <friendList.size(); i ++ )
        {
            temp[i] = friendList.get(i) ;
        }
        return temp ;
    }
    public Person LookUpFriends(int ID, int machineID) // give a userID, machineID look for friend
    {
        for(Machine m : server.machineList)
        {       
            if (m.machineID == machineID) 
            {
                for(Person p : m.personList)
                {
                    if (p.ID== ID)
                        return p;
                }
            }   
        }
        return null ;
    }
    public Machine LookUpMachine(int machineID) // given a machineID to look for machine 
    {
          for(Machine m : server.machineList)
          {
              if (m.machineID == machineID)
                  return m ;
          }   
          return null ;
    }


}
