package grailstowersofhanoi

class Tower {
	
  List rings

  def Tower(rings) {
    this.rings = rings
  }	
  
  def addRing(ring) {
	  rings?.push(ring)
  }
  
  def removeRing(ring) {
	  rings?.remove(ring)
  }

}
