object q04 {
  def main(args: Array[String]): Unit = {

     println(EvenOdd(8));
  }

  def EvenOdd(num:Int):String=num match{

    case 1 => "Odd"
    case 0 => "Even"
    case x if(num<0) => EvenOdd(-num)
    case _ => EvenOdd(num-2)

  }

}
