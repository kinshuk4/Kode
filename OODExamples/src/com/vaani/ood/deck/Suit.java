package com.vaani.ood.deck;

public enum Suit
{
    CLUBS(1),
    SPADES(2),
    HEARTS (3),
    DIAMONDS(4) ;
    
    private int suitValue;
    private Suit(int suitValue_){
    	suitValue = suitValue_;
    }
    
    public int getSuitValue()
    {
    	return this.suitValue;
    }
}
