object question03 {

  def main(args: Array[String]): Unit = {
    println(formatString("Benny", _.toUpperCase()))
    println(formatString("Niroshan", s => formatNames(s, 1)))
    println(formatString("Saman", _.toLowerCase()))
    println(formatString("Kumara", s => formatNames(s, 5)))
  }

  def formatString(str: String, formatter: String => String): String = {
    formatter(str)
  }

  def formatNames(name: String, index: Int): String = {
    val charChange = name.charAt(index)
    val charModified = charChange.toUpper
    name.patch(index, charModified.toString, 1)
  }
}






