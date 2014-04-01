package com.vaani.ood.SocialNetwork;

import java.util.ArrayList;

public class Machine {
    public ArrayList<Person> personList = new ArrayList<Person>() ;
    public int MachineID ;
	public int machineID;
    
    public Machine(int id)
    {
        this.MachineID = id ;
    }
    public void setMachineID(int id)
    {
        this.MachineID = id ;
    }
    
    public boolean LookUpPerson(Person p)
    {
        return this.MachineID == p.getItsMachineID() ;     // look up if the person in this machine        
    }
    public void addToMachine(Person p)
    {
        personList.add(p);
    }
    public ArrayList<Person> getPersonListFromMachine()
    {
       return personList ;
    }
}
