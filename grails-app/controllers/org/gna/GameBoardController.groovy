package org.gna

class GameBoardController {

    def index() {
        redirect(action: "game")
    }

    def game() {
        [pegs: [1,2,3]]
    }
}
