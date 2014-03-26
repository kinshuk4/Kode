package com.vaani.ood.JukeBox;

public class TrackSelector {
	public Song currentSong ;
	
	public TrackSelector(Song s)
	{
		this.currentSong = s ;
	}
	public void setCurrentSong(Song s)
	{
		this.currentSong = s ;
	}
	public Song getCurrentSong() {
		// TODO Auto-generated method stub
		return currentSong;
	}

}
