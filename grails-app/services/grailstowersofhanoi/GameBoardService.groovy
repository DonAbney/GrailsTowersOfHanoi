package grailstowersofhanoi

class GameBoardService {

	def generateBoard() {
		new GameBoard();
	}
	
	def dropRing(gameBoard, ringId, towerId) {
		gameBoard.updateTower(towerId, ringId)
	}
}
