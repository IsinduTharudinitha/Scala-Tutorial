import scala.io.StdIn

object question01 {

  def main(args: Array[String]): Unit = {

    val dep = getDepositValue();
    val interest = getInterset(dep);

    println("Interest for " + dep + " is " + interest +" for a year")

  }


  def getDepositValue(): Int = {

    println("Enter the Deposit: ")
    val deposit = StdIn.readInt()

    deposit

  }

  def getInterset(depo: Int): Double = {

    val rate =
      if (depo <= 20000) 0.02
      else if (depo <= 200000) 0.04
      else if (depo <= 2000000) 0.035
      else 0.065

    depo * rate
  }
}

