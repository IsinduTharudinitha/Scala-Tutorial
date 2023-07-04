object question02 {

  def main(args: Array[String]): Unit = {

      val input = args(0).toInt
      val result=func(input)
      println(result)

  }

  def func(number: Int): String = {
    val result = number match {
      case num if num <= 0 => "Negative/Zero is input"
      case num if num % 2 == 0 => "Even number is given"
      case _ => "Odd number is given"
    }

    result
  }
}
