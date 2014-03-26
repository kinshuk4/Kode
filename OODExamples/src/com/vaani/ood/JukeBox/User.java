package com.vaani.ood.JukeBox;

public class User {
    public String username ;
    private int userID ;
    public User(String username , int userID )
    {
        this.username = username ;
        this.userID = userID ;
    }
    public void setUser(String username,int userID )
    {
        this.username = username ;
        this.userID = userID ;
    }
    
    public String getUserName()
    {
        return username ;
    }
    public int getUserID()
    {
        return userID ;
    }
    
    public User getUser()
    {
        return this ; 
    }
    public User addUser(String name, int userID)
    {
       return new User(name, userID) ;
    }
}
