object q05 {


  def main (args: Array[String]):Unit={
    println(EvenSum(15))

  }

  def EvenSum(num:Int):Int=num match{
    case 0 => 0;
    case 1 => 0;
    case 2 => 0;
    case x if(num%2==0) => num-2 + EvenSum(num-2)
    case x if(num%2!=0) => num-1 + EvenSum(num-1)

  }
}
