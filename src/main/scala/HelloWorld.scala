import java.time.LocalDate
import java.time.format.{DateTimeFormatter, FormatStyle}

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val name = "mar"
    val age = 14
    println(name + " is "+ age + " year old")
    println(s"$name is $age years old")
    println(f"$name%s is $age%d years old")
    println(s"Heloo\nworld")
    println(raw"Hellow\nworld")
  }
  def getDate(): Unit = {
    val now = LocalDate.now
    val df = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)
    println(df.format(now))
  }
}

