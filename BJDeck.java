package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

import BlackJackBase.PCard;
import BlackJackBase.PDeck;
import BlackJack.BJCard;

public class BJDeck implements PDeck {
	// Attribute
	private ArrayList<BJCard> cards;

	// Constructor
	public BJDeck() {
		cards = new ArrayList<BJCard>();
		for (int i = 1; i <= 14; i++) {
			for (int j = 1; j <= 4; j++) {
				BJCard card = new BJCard(i, j);
				cards.add(card);
			} // end of for of int j
		} // end of for of int i
	}

	@Override
	public void shuffle() {
		Collections.shuffle(cards);
	}
	/** Randomizes the deck. */
	@Override
	public void addCard(PCard card) {
		cards.add((BJCard) card);
	}
	/** Adds a card to the end of the deck. */
	@Override
	public PCard dealCard() {
		if (cards.size() == 0) {
			return null;
		} else {
			return cards.remove(cards.size() - 1);
		}
	}
	/**
	 * Removes a card from the end of the deck. Returns Null if the deck is empty.
	 */

	@Override
	public PCard dealHiddenCard() {
		if (cards.size() == 0) {
			return null;
		} else {
			cards.get(cards.size() - 1).hideCard();
			return cards.remove(cards.size() - 1);
		}
	}

	/**
	 * Removes a card from the end of the deck and marks it as hidden. Returns Null
	 * if the deck is empty.
	 */

	@Override
	public int cardCount() {
		return cards.size();
	}/** Returns the number of cards in the deck. */

}
