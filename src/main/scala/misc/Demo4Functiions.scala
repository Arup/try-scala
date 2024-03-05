package misc

object Demo4Functiions{

        object Math{
        def add(x:Int,y:Int):Int={
        return x+y
        }
        def sq(x:Int)=x*x
        }
        def sub(x:Int,y:Int):Int={
        x-y
        }

        def mul(x:Int,y:Int):Int=x*y

        def div(x:Int,y:Int)=x/y

        def main(args:Array[String])={
        println(div(343,3))
        println(Math.add(2,3))
        println(s"Math sq 3 = ${Math sq 3}")
        }

        }
