package grailstowersofhanoi;

import org.junit.Test;

class TowerTest {

	@Test
	void addRingIncreasesCountOfRingsOnTower() {
		List rings = []
		Tower tower = new Tower(rings)
		assertTrue(tower.rings.size() == 0)
		tower.addRing(new Ring(1))
		assertTrue(tower.rings.size() == 1)
	}
	
	@Test
	void removeRingDecreasesCountOfRingsOnTower() {
		Ring ring = new Ring(1)
		List rings = [ring]
		Tower tower = new Tower(rings)
		assertTrue(tower.rings.size() == 1)
		tower.removeRing(ring)
		assertTrue(tower.rings.size() == 0)
	}
}
