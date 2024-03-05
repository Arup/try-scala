// package misc

// import org.apache.spark.{SparkConf, SparkContext}

// //For some reason run this with Java 1.8 wroks
// //See https://stackoverflow.com/questions/69814385/exception-in-thread-main-java-lang-illegalaccesserror-class-org-apache-spark
// object Hello{
//         def main(args:Array[String])={
//         val conf=new SparkConf().setMaster("local[*]").setAppName("Demo");

//         val sc=new SparkContext(conf);
//         val text=sc.textFile("res/input.txt")
//         println("class of text is",text.getClass)
//         val counts=text.flatMap(line=>line.split(" ")
//         ).map(word=>(word,1)).reduceByKey(_+_)

//         val num=counts.collect

// //    val rdd = sc.parallelize(Array(5,20,30))
// //    println(rdd.reduce(_+_))
//         println("total number of words {}",num.length)
//         }

// //  def wordMap([]) : [] = {
// //
// //  }

//         }
