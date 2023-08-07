object question_01 {

  def main(args: Array[String]): Unit = {

    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val outputList = filterEvenNum(inputList)
    println(outputList)
     }


  def filterEvenNum (numbers: List[Int]): List[Int]
  =
  {
    numbers.filter(number => number % 2 == 0)
  }


}
