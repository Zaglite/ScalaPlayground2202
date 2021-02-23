class House (houseName: String, var heating:String, var hasGarage: Boolean = false) {
  //so if I add a default value in Class definition I do not have to initialize that property, but I can if I want to

  // this is blueprint for creating object instances
  //public properties are by default
  val style = "gothic"
  var isForSale = false
  var color = "green"
  var age = 25

  // we can keep some information private
  private val mySecret = "my secret"
  private var mutableSecret = "this can be changed"
  // this is information hiding from other persons of your classes
  println("New house created!") // code within class runs when a new object is made fom blueprints
  // this is a constructor for our object, in other pr.languages you have to name it, but not in Scala

  // class methods will not be run on construction, they will be ready for use later

  // all functions are methods because they are defined inside of classes???

  def prettyPrint(): Unit = {
    println(s"House name: $houseName style: $style, is for sale? $isForSale, what color? $color, age? $age, heating: $heating")
    println(s"Has garage: $hasGarage ")
  }
  // in many other languages you have to specify these values/variables this class object comes from
  // in Scala it is automatic

  def showSecret() = println(s"My secret is $mySecret")
  // this is so called getter!!!
  def getSecret(): String = {
    // here could be code for validation, verification, extra security checks etc.
    mySecret
  }

  def getMutSecret(): String = mutableSecret
  def getMutSecret(txt: String): String = {
    // I could check here for txt validity etc.
    mutableSecret = sanitizer(txt)
    "Success!!" // I could turn nothing on setter
  }

  // I could have a pub.method of passing data and returning a result
  def myAdd(a:Int, b:Int) = {
    // without this comment no need for curly braces
    a+b
  }

  // private methods are for internal use only
  private def sanitizer(txt: String) = { //I could do more stuff here
    txt.toLowerCase()
  }
  println("New object creation finished")

}
