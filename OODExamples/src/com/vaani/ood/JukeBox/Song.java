package com.vaani.ood.JukeBox;

public class Song {
	public String songname ;
	//We can have many other properties, like year, genre etc
	public Song(String songname)
	{
		this.songname = songname ;
	}
	public String getSongName()
	{
		return songname ;
	}

}
