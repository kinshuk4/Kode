package com.vaani.ood.deck;

class Dealer extends Player {
    private Deck deck;

    public Dealer(int deckSize) {
        this.deck = new Deck(deckSize);
    }

    public void deal(Player[] players, int numberOfCards) {
        for (Player player : players) {
            for (int i=0; i<numberOfCards; i++) {
                player.addCard(this.deck.getTopCard());
            } 
        }
    }

    // .....
}