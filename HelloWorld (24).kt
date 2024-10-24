fun main() {
    val greeting = birthdayGreeting()
    println(greeting)
   
}


fun birthdayGreeting():String {
  
  val nameGreeting = "Happy Birthday Aditya"

  val ageGreeting = "you are 24 years old now"
  
  
  return "$nameGreeting\n$ageGreeting"
  
  
  
}


//Output:

Happy Birthday Aditya
you are 24 years old now