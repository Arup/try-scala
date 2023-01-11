import org.apache.spark
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
object Hello {
  def main(args: Array[String]) = {
    val conf = new SparkConf().setMaster("local[*]").setAppName("Demo");

    val sc = new SparkContext(conf);
    val text = sc.textFile("res/input.txt")
    println("class of text is",text.getClass)
    val counts = text.flatMap(line => line.split(" ")
    ).map(word => (word,1)).reduceByKey(_+_)

    val num = counts.collect

//    val rdd = sc.parallelize(Array(5,20,30))
//    println(rdd.reduce(_+_))
    println("total number of words {}", num.length)
  }

//  def wordMap([]) : [] = {
//
//  }

}
