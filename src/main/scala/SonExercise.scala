object SonExercise extends App {
  //TODO create 2 song objects with authors, title and lyrics
  //TODO call sing and yell methods
  val myBonnieLyrics: Seq[String] = Seq("My Bonnie lies over the ocean",
    "My Bonnie lies over the sea",
    "Well, my Bonnie lies over the ocean",
    "Yeah, bring back my Bonnie to me",
    "Yeah, bring back, ah, bring back",
    "Oh, bring back my Bonnie to me, to me",
    "Ah, bring, oh, bring back, ah, bring back",
    "Oh, bring back my Bonnie to me!")

  // this is called instantiation using Song blueprint
  val myBonnie = new Song("My Bonnie", "Tony Sheridan", myBonnieLyrics)

  myBonnie.singSong()
  myBonnie.yellSong()
  myBonnie.singBonus(times = 2)


}
