object q01 {

  def main(args: Array[String]): Unit = {
      var bool=prime(6)
      println(bool)

  }

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (x == p) => return true
    case x if gcd(p, x) > 1 => return false
    case x => prime(p, x + 1)
  }

  def gcd(a: Int, b: Int): Int = {
    if (b == 0)
      a
    else
      gcd(b, a % b)
  }


}
