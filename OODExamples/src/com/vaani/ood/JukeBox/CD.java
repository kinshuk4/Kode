package com.vaani.ood.JukeBox;

import java.util.ArrayList;

public class CD {
	public String cdname ;
	public ArrayList<Song> songlist ;
    public CD( String name , ArrayList<Song> songlist)
    {
        this.cdname = name ;
        this.songlist = songlist ;
        //this.cd = c ;
    }
    public  ArrayList<Song> getSongList()
    {
    	return songlist ;
    }
    public String getCDName()
    {
    	return cdname ;
    }


}
