object q02 {

  def main(args: Array[String]): Unit = {

    if (args.length != 1) {
      println("Usage: scala PatternMatching.scala <integer>")
      sys.exit(1)
    }

    val inputNumber = args(0).toInt

    val result = inputNumber match {

      case num if num <= 0 => "Negative/Zero is input"
      case num if num % 2 == 0 => "Even number is given"
      case _ => "Odd number is given"
    }

    println(result)
  }
}
