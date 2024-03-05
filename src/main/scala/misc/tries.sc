val x = 1

val y = 2

x + y

def test(a: Int) = a * a

test(2)

def test2(a: => Int) = a * a

test2(3)

//def and(x:Boolean, y:Boolean) = if x then y else false

var str = Seq("STILL","MORE","HELLO")
  .map(_.toLowerCase).
  mkString("[",",","]")

def fac(n:Int): Int = if (n<=0) 1; else n*fac(n-1)

print(fac(3))

def signum(x: Int) =
  if (x > 0)  1 ;
  else if(x<0) -1;
  else 0;

print(signum(12))

def countdown(x:Int): Unit=
  if(x==0) println(0);
  else {
    println(x)
    countdown(x-1)
  }

println(countdown(7))



val seq = (0 until 6) map { n =>
  if (n%2 == 0)  Some(n.toString)
  else None
  }