package grailstowersofhanoi

class GameBoard {

	List towers = []

	def GameBoard() {
		towers[0] = new Peg([new Ring(1),new Ring(2), new Ring(3)])
		towers[1] = new Peg([])
		towers[2] = new Peg([])
	}

	def updateTower(towerId, ringId) {

		def ring = getRingToMove(ringId.toInteger())
		towers.each {peg -> peg?.removeRing(ring)}
		towers[towerId.toInteger()].addRing(ring)
	}

	Ring getRingToMove(Integer ringId) {
		Ring ringToMove
		
		towers.each {peg ->
			if (!peg?.rings?.isEmpty()) {
				peg.rings.each {ring ->
					if (ring.id == ringId) ringToMove = ring
				}
			}
		}
		ringToMove
	}
}
