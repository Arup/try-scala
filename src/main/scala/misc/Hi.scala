package misc
import scala.io.StdIn
object Hi{

  var n = 10
  var i =0
  var r= 0

 def main(args: Array[String]): Unit = {
//    val name = StdIn.readLine("Your name: ")
//     print("Your age: ")
//     val age = StdIn.readInt()
//     println(s"Hello, ${name}! Next year, you will be ${age + 1}.")


    for {i <- 1 to n}
      r = r * i

    //println(r)

    val s = "Hello"
    var sum = 0
    for {i <- 0 to s.length - 1}
      sum += s(i)

    println(sum)

    val result = for {i <- 1 to 10} yield i % 3

    //print(recursiveSum(Array[Int]{1,2,3,4});
  }

//  def sum(args: Int*) =
//    var result = 0
//    for{ arg <- args } do
//      result += arg
//  result
def recursiveSum(args: Array[Int]) : Int =
  if (args.length == 0)  0
  else args.head + recursiveSum(args.tail)
}