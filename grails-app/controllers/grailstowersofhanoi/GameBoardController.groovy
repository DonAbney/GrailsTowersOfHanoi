package grailstowersofhanoi

class GameBoardController {
	
	GameBoardService gameBoardService;

    def index() {
        redirect(action: "game")
    }

    def game() {
		GameBoard gameBoard = gameBoardService.generateBoard()
		session.gameBoard = gameBoard
        [towers: gameBoard.towers]
    }
}
