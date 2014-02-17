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
	
	def dropRing() {
		def ringId = params.ringId
		def towerId = params.towerId
		gameBoardService.dropRing(session.gameBoard, ringId, towerId)
		render(template: "board", model: [towers: session.gameBoard.towers])
	}
}
