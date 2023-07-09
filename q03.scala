object q03 {

  def main(args: Array[String]):Unit={

    println(sum(7))

  }

  def sum(x:Int):Int= x match{
    case 1 => 1
    case _ => x + sum(x-1)

  }

}
