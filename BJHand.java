package BlackJack;

import java.util.ArrayList;

import BlackJackBase.PCard;
import BlackJackBase.PHand;

public class BJHand implements PHand {
	// Attribute
	private ArrayList<BJCard> hand;

	// Constructor
	public BJHand() {
		hand = new ArrayList<BJCard>();
	}
	
	// Method
	@Override
	public int getSize() {
		return hand.size();
	}

	/** Returns the number of cards in the hand. */

	@Override
	public void addCard(PCard card) {
		hand.add((BJCard) card);
	}
	/** Adds a card to the end of the hand. */
	@Override
	public PCard getCard(int index) {
		return hand.get(index);
	}
	/** Returns a card from the hand (but not removed). */
	@Override
	public PCard removeCard(int index) {
		return hand.remove(index);
	}
	/** Removes and returns the card */
	@Override
	public int getValue() {
		int point = 0;
		for (int i = 0; i < hand.size(); i++) {
			for (int j = 2; j <= 10; j++) {
				if (hand.get(i).getRank() == j) {
					point += j;
				} // end of if
			} // end of for loop of j
			if (hand.get(i).getRank() == BJCard.JACK) {
				point += 10;
			} // end of jack
			else if (hand.get(i).getRank() == BJCard.KNIGHT) {
				point += 10;
			} // end of knight
			else if (hand.get(i).getRank() == BJCard.QUEEN) {
				point += 10;
			} // end of queen
			else if (hand.get(i).getRank() == BJCard.KING) {
				point += 10;
			} // end of king
			else if (hand.get(i).getRank() == BJCard.ACE) {
				if (point >= 11) {
					point += 1;
				} // end of else of ace
				else {
					point += 11;
				} // end of else of ace
			} // end of else if
			if (hand.contains(BJCard.ACE)) {
				if (point >= 21) {
					point = point - 10;
				} // end of if about 21
			} // end of if about contains.
		} // end of for loop of i
		return point;
	}/**
		 * Returns the point value of the current hand. Basic BlackJack rules apply:
		 * Ranks 2 - 10 are valued at their face value Ranks Jack - King are valued at
		 * 10 Ace is valued at 11 if the total value of all cards in the hand is <= 21
		 * Otherwise, Ace is valued as 1
		 */
}
