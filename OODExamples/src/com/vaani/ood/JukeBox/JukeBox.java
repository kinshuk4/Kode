package com.vaani.ood.JukeBox;

import java.util.HashSet;

public class JukeBox
{
    public CDPlayer cdPlayer ;
    public User user ;
    public HashSet<CD> cdSet ;
    public TrackSelector SongSelector ; 
    
    public JukeBox(CDPlayer cdPlayer, User user , HashSet<CD> cdSet, TrackSelector SongSelector)
    {
        this.cdPlayer = cdPlayer ;
        this.user = user ; 
        this.cdSet = cdSet ;
        this.SongSelector = SongSelector ;  
    }
    
    public Song getCurrentSong()
    {
        return SongSelector.getCurrentSong() ;
    }
    public void processOneUser(User user)
    {
        this.user = user ;
    }
    

}