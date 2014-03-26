package com.vaani.ood.JukeBox;

import java.util.Queue;

public class PlayerList {
    public Song song ;
    public Queue<Song> SongQue ;
    
    public PlayerList( Queue<Song> SongQue , Song song )
    {
       //SongQue = new Queue<Song>() ; 
    	super() ;
       this.SongQue = SongQue ;
       this.song = song ;
       
    }
    public Song getTrack()
    {
        return song ;
    }
    public void addSongToPlayerList(Song s)
    {
        SongQue.add(s) ;
    }
    public Song nextSongToPlay()
    {
        return SongQue.poll() ;
    }
}
