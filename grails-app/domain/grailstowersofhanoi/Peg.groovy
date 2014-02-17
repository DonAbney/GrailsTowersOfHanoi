package grailstowersofhanoi

class Peg {
	
  List rings

  def Peg(rings) {
    this.rings = rings
  }	
  
  def addRing(ring) {
	  rings?.push(ring)
  }
  
  def removeRing(ring) {
	  rings?.remove(ring)
  }

}
