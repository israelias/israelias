class ReadMe(val username: String = "israelias", val year: Int = 2022) {
  val name: String = "Joem Elias Sanez"
  val education: Map[String, List[String]] = Map(
    "programming" -> List("Full Stack Software Development", "Code Institute"),
    "architecture" -> List("Master of Architecture", "Columbia University"),
    "art" -> List("Bachelor of Fine Arts", "Otis College of Art and Design")
  )
  val employment: Map[String, List[Any]] = Map(
    "engineer" -> List("ResultsCX", List("Manila", "Fort Lauderdale")),
    "architect" -> List("Foster + Partners", List("Singapore", "New York")),
    "designer" -> List("Herzog & de Meuron", List("New York", "Basel")),
    "all of the above" -> List("you", List("projects", "anywhere"))
  )

  def doing(now: Int = 2023): String = {
    val today = year

    if (now < today) {
      val experience = employment("architect").asInstanceOf[List[Any]]
      s"""
      I was a design architect with ${experience.head} in ${experience(1).asInstanceOf[List[String]].head}.
      """
    } else if (now == today) {
      val dream = employment("engineer")
      s"""
      I am currently in Application Development for ${dream.head} in ${dream(1).asInstanceOf[List[String]].head}.
      """
    } else if (now > today) {
      val goal = employment("all of the above")
      s"""
      I am eager to collaborate with ${goal.head} on ${goal(1).asInstanceOf[List[String]].head} ${goal(1).asInstanceOf[List[String]](1)}.
      """
    } else {
      """
      ### Hi there 👋
      """
    }
  }

  def collaborate(role: String, organization: String, location: List[String]): Unit = {
    employment + (role -> List(organization, location))
  }
}

object Main extends App {
  val me = new ReadMe(2022)
  println(me.doing(2023))
}