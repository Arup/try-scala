object Demo2Strings {
  def main(args: Array[String]): Unit = {
    var res = ""
    val x = 20;
    if (x == 20)
      res = ("x=20")
    else
      res = ("x is not 20")
    println(res)

    val res2 = if(x==20) "x==20" else "x!=20";
    println(res2)
  }
}
