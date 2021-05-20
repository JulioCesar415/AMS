import java.time.DayOfWeek
import java.time.LocalDate
import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    dayOfWeek()
    feedTheFish()
    randomDay()
//    fitMoreFish()
    

}

fun dayOfWeek(){
    println("What day is it today?")
    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when (day){
        1 -> "Sunday"
        2 -> "Monday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Sunday"
        else -> "Time has stopped"
    })
}
//fun with argument day that is initialized the return value of randomDay()
fun feedTheFish(day: String = randomDay()) {
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}
//fun uses Random oject to randomly pic a string from list in week and returns string
fun  randomDay(): String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday",
    "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}
//fun returns different food for each day of week
fun fishFood(day: String) : String{
//    when-statement returns specific food for each day of the week
    return when(day){
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}
//fun checks if we can add another fish into a tank that already has fish
fun fitMoreFish(
    tankSize: Double = 10.0,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true): Boolean{

//    return value
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}