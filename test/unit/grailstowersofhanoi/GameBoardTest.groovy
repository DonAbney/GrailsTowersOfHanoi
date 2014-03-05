package grailstowersofhanoi;

import org.junit.Test;

class GameBoardTest {

    @Test
	void getRingToMoveShouldReturnRingWithCorrectId() {
		GameBoard board = new GameBoard()
		Ring actualRing = board.getRingToMove(2)
		assertEquals(2, actualRing.id)
	}
	
	@Test
	void updateTowerPutsRingOnCorrectTower() {
		GameBoard board = new GameBoard()
		assertTrue(board.towers[0].rings.size() == 3)
		board.updateTower(1, 3)
		assertTrue(board.towers[0].rings.size() == 2)
		assertTrue(board.towers[1].rings.size() == 1)
	}
}
