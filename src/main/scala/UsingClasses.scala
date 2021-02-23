//in Scala objects define so called singleton objects in OOP terms
//this means only one UsingClasses exists
//it could also be a companion object to class
object UsingClasses extends App {
  val myHouse = new House(houseName = "Birzmaļi", heating = "central") // to create new objects from regular classes need NEW keyword
  println(myHouse) // by default printing object created from class blueprint will show just memory address
  println(myHouse.age, myHouse.color, myHouse.isForSale, myHouse.style) // we can print these properties
  myHouse.prettyPrint()

  val friendsHouse = new House(houseName = "Piejūras", heating = "wood", hasGarage = true)
  friendsHouse.prettyPrint()
  friendsHouse.isForSale = true
  friendsHouse.color = "red"
  friendsHouse.heating = "gas" // i can change var properties
  friendsHouse.prettyPrint()
  // println(friendsHouse.isForSale, friendsHouse.color, friendsHouse.age, friendsHouse.style)

  friendsHouse.showSecret() // I don't have access to private data, but I can use methods to get them
  val coolSecret = myHouse.getSecret()
  println (coolSecret)
  println(myHouse.getMutSecret())
  myHouse.getMutSecret("New private INFO") //this is a sort of new restriction
  println(myHouse.getMutSecret())
  println(myHouse.myAdd(3,1000))

  val castle = new FancyHouse() // objects created from FancyHouse blueprints will inherit functionality from House
  castle.prettyPrint() // prettyPrint is inherited from House
  castle.addNewPainting(paintName = "No Baznīcas")

}
