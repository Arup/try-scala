package misc

object Demo3LoopNMatch {
  def main(args: Array[String]): Unit = {
    /*
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
     */

//    val age = 55
//
//    age match {
//      case 20 => println(age)
//      case 30  => println(age)
//      case 40  => println(age)
//
//      case _  => println(age)
//    }
val age = "55"

//    age match {
//      case "20" => println(age)
//      case "30"  => println(age)
//      case "40"  => println(age)
//      case _  => println(age)
//    }
val res =  age match {
      case "20" => age
      case "30"  => age
      case "40"  => age
      case _  => "default"
    }

    //println(res)
    val i = 10
    val evenOrOdd = i match {
      case 1 | 3 | 5 | 7 | 9 => "odd"
      case 2 | 4 | 6 | 8 | 10 => "even"
      case _ => "some other number"
    }

   // println(f"$i%d is $evenOrOdd%s")

    val count = 0
    count match {
      case 1 => println("one, a lonely number")
      case x if x == 2 || x == 3 => println("two's company, three's a crowd")
      case x if x > 3 => println("4+, that's a party")
      case _ => println("i'm guessing your number is zero or less")
    }

    def showNotification(notification: Notification): String = {
      notification match {
        case Email(sender, title, _) =>
          s"You got an email from $sender with title: $title"
        case SMS(number, message) =>
          s"You got an SMS from $number! Message: $message"
        case VoiceRecording(name, link) =>
          s"You received a Voice Recording from $name! Click the link to hear it: $link"
      }
    }

    def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
      notification match {
        case Email(sender, _, _) if importantPeopleInfo.contains(sender) =>
          "You got an email from special someone!"
        case SMS(number, _) if importantPeopleInfo.contains(number) =>
          "You got an SMS from special someone!"
        case other =>
          showNotification(other) // nothing special, delegate to our original showNotification function
      }
    }

    val someSms = SMS("12345", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    println(showNotification(someSms))  // prints You got an SMS from 12345! Message: Are you there?
    println(showNotification(someVoiceRecording))


    val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")
    val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
    val importantSms = SMS("867-5309", "I'm here! Where are you?")

    println(showImportantNotification(someSms, importantPeopleInfo)) // prints You got an SMS from 123-4567! Message: Are you there?
    println(showImportantNotification(someVoiceRecording, importantPeopleInfo)) // prints You received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123
    println(showImportantNotification(importantEmail, importantPeopleInfo)) // prints You got an email from special someone!
    println(showImportantNotification(importantSms, importantPeopleInfo))
  }
}

sealed trait Notification

case class Email(sender: String, title: String, body: String) extends Notification

case class SMS(caller: String, message: String) extends Notification

case class VoiceRecording(contactName: String, link: String) extends Notification