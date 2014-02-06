package grailstowersofhanoi

class GameBoard {

  List towers = []

  def GameBoard() {
    towers[0] = new Peg([new Ring(1), new Ring(2), new Ring(3)])
    towers[1] = new Peg()
    towers[2] = new Peg()
  }

}
