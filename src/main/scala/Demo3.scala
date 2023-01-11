object Demo3 {
  def main(args: Array[String]): Unit = {
    var x = 0;
    for (i <- 1.until(6)){
      println("i is" + i)
    }
    val lst = List(1,2,3,4,5,6,7,8,9)

    for(i<- lst ; if i<5)
      println("curr val of lst"+i)

    val res = for{i<- lst
                  if i<5} yield {
      i*i
    }

    println("res="+res)
  }
}
