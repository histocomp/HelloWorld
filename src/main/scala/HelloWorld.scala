object HelloWorld {

  def main(args: Array[String]): Unit = {
    val vectorofnames = args.toVector
    val Names = vectorofnames.map(Name)
    println(Names)
    val MeasureOfAMan = Names.map(hotornot)
    println(MeasureOfAMan)
    MeasureOfAMan.map(println)

  }


  def hotornot(nickname: Name): String = {
    nickname match {
      case Name("Tomas") => "You need a haircut"
      case Name("Fred") => "Lookin Good!"
      case _ => "Who are you again?"

    }
  }
}

