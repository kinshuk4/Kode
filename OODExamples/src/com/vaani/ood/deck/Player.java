package com.vaani.ood.deck;

public class Player {
    protected String name;
    protected Deck hand = new Deck();

    public Player()
    {
    	
    }
    public void addCard(Card c) {
        this.hand.addCard(c);
    }

    // .....
}