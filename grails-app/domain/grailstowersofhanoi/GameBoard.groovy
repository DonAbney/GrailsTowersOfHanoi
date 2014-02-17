package grailstowersofhanoi

class GameBoard {

	List towers = []

	def GameBoard() {
		towers[0] = new Tower([new Ring(1),new Ring(2), new Ring(3)])
		towers[1] = new Tower([])
		towers[2] = new Tower([])
	}

	def updateTower(towerId, ringId) {

		def ring = getRingToMove(ringId.toInteger())
		towers.each {tower -> tower?.removeRing(ring)}
		towers[towerId.toInteger()].addRing(ring)
	}

	Ring getRingToMove(Integer ringId) {
		Ring ringToMove
		
		towers.each {tower ->
			if (!tower?.rings?.isEmpty()) {
				tower.rings.each {ring ->
					if (ring.id == ringId) ringToMove = ring
				}
			}
		}
		ringToMove
	}
}
