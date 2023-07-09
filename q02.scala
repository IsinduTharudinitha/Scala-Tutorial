object q02 {

  def main(args: Array[String]):Unit={
    primeSeq(10)

  }

  def isPrime(num: Int, divisor: Int): Boolean = {
    if (divisor == 1) true
    else if (num % divisor == 0) false
    else isPrime(num, divisor - 1)
  }

  def primeSeq(n: Int, current: Int = 2): Unit = {
    if (current < n) {
      if (isPrime(current, current - 1)) {
        print(current + " ")
      }
      primeSeq(n, current + 1)
    }
  }
}
