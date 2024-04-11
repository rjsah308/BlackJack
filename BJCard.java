package BlackJack;

import java.awt.Color;

import BlackJackBase.PCard;

public class BJCard extends PCard {
	// Attribute
	private int rank;
	private int suit;
	private boolean hidden;
	public static final int ACE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 11;
	public static final int KNIGHT = 12;
	public static final int QUEEN = 13;
	public static final int KING = 14;

	public static final int SPADE = 1;
	public static final int HEART = 2;
	public static final int DIAMOND = 3;
	public static final int CLUB = 4;

	// Constructor
	public BJCard() {
		rank = 0;
		suit = 0;
		hidden = false;
	}

	public BJCard(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
		hidden = false;
	}

	// Method
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	@Override
	public void hideCard() {
		hidden = true;
	}

	@Override
	public void showCard() {
		hidden = false;
	}

	@Override
	public boolean isHidden() {
		if (hidden) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String getText() {
		String rankStr = "";
		switch (suit) {
		case SPADE:
			switch (rank) {
			case ACE:
				rankStr = "A\u2660";
				break;
			case TWO:
				rankStr = "2\u2660";
				break;
			case THREE:
				rankStr = "3\u2660";
				break;
			case FOUR:
				rankStr = "4\u2660";
				break;
			case FIVE:
				rankStr = "5\u2660";
				break;
			case SIX:
				rankStr = "6\u2660";
				break;
			case SEVEN:
				rankStr = "7\u2660";
				break;
			case EIGHT:
				rankStr = "8\u2660";
				break;
			case NINE:
				rankStr = "9\u2660";
				break;
			case TEN:
				rankStr = "10\u2660";
				break;
			case JACK:
				rankStr = "J\u2660";
				break;
			case KNIGHT:
				rankStr = "KN\u2660";
				break;
			case QUEEN:
				rankStr = "Q\u2660";
				break;
			case KING:
				rankStr = "K\u2660";
				break;
			}
			break;
		case HEART:
			switch (rank) {
			case ACE:
				rankStr = "A\u2764";
				break;
			case TWO:
				rankStr = "2\u2764";
				break;
			case THREE:
				rankStr = "3\u2764";
				break;
			case FOUR:
				rankStr = "4\u2764";
				break;
			case FIVE:
				rankStr = "5\u2764";
				break;
			case SIX:
				rankStr = "6\u2764";
				break;
			case SEVEN:
				rankStr = "7\u2764";
				break;
			case EIGHT:
				rankStr = "8\u2764";
				break;
			case NINE:
				rankStr = "9\u2764";
				break;
			case TEN:
				rankStr = "10\u2764";
				break;
			case JACK:
				rankStr = "J\u2764";
				break;
			case KNIGHT:
				rankStr = "KN\u2764";
				break;
			case QUEEN:
				rankStr = "Q\u2764";
				break;
			case KING:
				rankStr = "K\u2764";
				break;
			}
			break;
		case DIAMOND:
			switch (rank) {
			case ACE:
				rankStr = "A\u25C6";
				break;
			case TWO:
				rankStr = "2\u25C6";
				break;
			case THREE:
				rankStr = "3\u25C6";
				break;
			case FOUR:
				rankStr = "4\u25C6";
				break;
			case FIVE:
				rankStr = "5\u25C6";
				break;
			case SIX:
				rankStr = "6\u25C6";
				break;
			case SEVEN:
				rankStr = "7\u25C6";
				break;
			case EIGHT:
				rankStr = "8\u25C6";
				break;
			case NINE:
				rankStr = "9\u25C6";
				break;
			case TEN:
				rankStr = "10\u25C6";
				break;
			case JACK:
				rankStr = "J\u25C6";
				break;
			case KNIGHT:
				rankStr = "KN\u25C6";
				break;
			case QUEEN:
				rankStr = "Q\u25C6";
				break;
			case KING:
				rankStr = "K\u25C6";
				break;
			}
			break;
		case CLUB:
			switch (rank) {
			case ACE:
				rankStr = "A\u2663";
				break;
			case TWO:
				rankStr = "2\u2663";
				break;
			case THREE:
				rankStr = "3\u2663";
				break;
			case FOUR:
				rankStr = "4\u2663";
				break;
			case FIVE:
				rankStr = "5\u2663";
				break;
			case SIX:
				rankStr = "6\u2663";
				break;
			case SEVEN:
				rankStr = "7\u2663";
				break;
			case EIGHT:
				rankStr = "8\u2663";
				break;
			case NINE:
				rankStr = "9\u2663";
				break;
			case TEN:
				rankStr = "10\u2663";
				break;
			case JACK:
				rankStr = "J\u2663";
				break;
			case KNIGHT:
				rankStr = "KN\u2663";
				break;
			case QUEEN:
				rankStr = "Q\u2663";
				break;
			case KING:
				rankStr = "K\u2663";
				break;
			}
			break;
		default:
			break;
		}
		return rankStr;
	}//get String
	
	@Override
	public Color getFontColor() {
		Color font = Color.LIGHT_GRAY;
		switch(this.suit) {
		case 1:
			font = Color.BLACK;
			break;
		case 2:
			font = Color.RED;
			break;
		case 3:
			font = Color.RED;
			break;
		case 4:
			font = Color.BLACK;
			break;
		}
		return font;
	}
	
	@Override
	public Color getBackColor() {
		return Color.black;
	}

	@Override
	public Color getBorderColor() {
		return Color.BLUE;
	}

	@Override
	public Color getStripeColor() {
		return Color.GREEN;
	}
}
