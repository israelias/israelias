class ReadMe ( var year: Int = 2023) {
  val username: String = "israelias"
  private var education: Map[String, Map[String, String]] = Map(
      "programming" -> Map(
        "Software Development" -> "Code Institute"
      ),
      "architecture" -> Map(
        "Master of Architecture" -> "Columbia University"
      ),
      "art" -> Map(
        "Bachelor of Fine Arts" -> "Otis College of Art and Design"
      )
    )

  def doing(now: Int): Unit =
    if (year < now)
      val experience = education.get("programming")
      println(experience)
    else if (year == now)
      val dream = education.get("programming")
      println(dream)
    else if (year > now)
      val goal = education.get("programming")
      println(goal)
    else
      println("Hello!")


//  val attrs = List(ReadMe("foo", 1), ReadMe("bar", 2))
//  val edu = List
//  val employment:Map[String,Int] = list.map(org => (attrs.prop1, attrs.prop2))(collection.breakOut)

}

object Me extends App {
  private val me = ReadMe(2023)
  me.doing(2023)
}
