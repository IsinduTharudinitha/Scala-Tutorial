object q06 {

  def main(args: Array[String]):Unit={
     printFibonacci(8)

  }

  def fibonacci(n: Int): List[Int] = {

    if (n <= 0) {
      List()
    } else if (n == 1) {
      List(0)
    } else if (n == 2) {
      List(0, 1)
    } else {
      val fibSeq = fibonacci(n - 1)
      fibSeq :+ (fibSeq(n - 2) + fibSeq(n - 3))

    }
  }

  def printFibonacci(n: Int): Unit = {
    val fibSeq = fibonacci(n)
    println(fibSeq.mkString(" "))
  }


}
