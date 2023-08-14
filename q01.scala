
  object q01 {

    def main(args: Array[String]): Unit = {

      val deposit = 25000.0
      val interestCalc: Double => Double = calculateInterest

      val interest = interestCalc(deposit)

      println(s"The interest earned on Rs."+ deposit+" is Rs. "+interest)
    }

    def calculateInterest: Double => Double = {

      case amount if amount <= 20000 => amount * 0.02
      case amount if amount <= 200000 => amount * 0.04
      case amount if amount <= 2000000 => amount * 0.035
      case amount => amount * 0.065
    }
  }


