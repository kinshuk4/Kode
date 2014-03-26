package com.vaani.ood.deck;

public class Card implements Comparable<Card>{

	   private Suit suit;
	   private Rank rank;

	public Card(Suit suit, Rank rank) {
	    this.suit = suit;
	    this.rank = rank;
	}
	
	

	@Override
	public int compareTo(Card card2) {
		if(card2==null)
			return 1;
		
		int suit2 = card2.getSuit().getSuitValue();
		int rank2 = card2.getRank().getCardValue();
		
		if(suit.getSuitValue()!=suit2)
				return suit.getSuitValue() - suit2;
		if(rank.getCardValue() != rank2)
			return rank.getCardValue()  - rank2;
		
		return 0;
	}

	//getters and setters
	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
}