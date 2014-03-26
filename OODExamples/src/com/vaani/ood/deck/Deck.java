package com.vaani.ood.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class Deck {
    private Stack<Card> cards = new Stack<Card>();

    public Deck() { }

    public Deck(int numberOfCards) {
        for (int i=0; i<numberOfCards; i++) {
            cards.push(CardFactory.createCard(i));
        }
    }

    private void shuffle() {
        Collections.shuffle(this.cards);
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public void removeAllCards() {
        this.cards.removeAllElements();
    }

    public void removeCard(Card c) {
        int i = this.cards.search(c);
        this.cards.remove(i);            
    }

    public Card getCard(Card c) {
        int i = this.cards.search(c);
        return this.cards.get(i);
    }

    public Card getTopCard() {
        return this.cards.pop();
    }

    public Card getNthCard(int i) {
        return this.cards.get(i);
    }

    public Card addCard(Card c) {
        this.cards.push(c);
        return c;
    }

}