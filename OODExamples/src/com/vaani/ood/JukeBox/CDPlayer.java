package com.vaani.ood.JukeBox;
public class CDPlayer
{
    //public CD cd ;
    public CD cd ; 
    public PlayerList p ;
    
    public CDPlayer(CD cd ,PlayerList p )
    {
    	super();
        this.cd = cd ;
        this.p = p ;
    }
    public void setPlayerList(PlayerList p)
    {
        this.p =  p; 
    }
    public void setCD(CD c)
    {
        this.cd = c ;
    }
    public PlayerList getPlayerList()
    {
        return p ;
    }
    public CD getCD()
    {
        return cd ;
    }
    public void playSong(Song s)
    {
        
    }
}