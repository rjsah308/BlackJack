package BlackJack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BJCardTest {
	BJCard card = new BJCard(1,1);
	@Test
	void testGetRank() {
		int rank = card.getRank();
		assertEquals(rank, 1);
	}

	@Test
	void testSetRank() {
		card.setRank(2);
		int rank = card.getRank();
		assertEquals(rank, 2);
	}

	@Test
	void testGetSuit() {
		int suit = card.getSuit();
		assertEquals(suit, 1);
	}

	@Test
	void testSetSuit() {
		card.setSuit(2);
		int suit = card.getSuit();
		assertEquals(suit, 2);
	}

}
