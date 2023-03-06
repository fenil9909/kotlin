import java.util.*;
fun main(){
    feedthefish()
}





fun feedthefish(){

    val day=randomday()
    val food=randomfood()

    println("Today day is $day and food is $food")
}


fun randomday():String{

    val week=arrayOf("monday","tuesday","wednesday","thursday"
    ,"friday","saturday")

    return week[Random().nextInt(week.size)]


    //this would return an random day from the week array
    // and the working is like Random().nextInt -> is used for
    //returning a random value and here we want the random value from a range like the
    //size of the week array so in the nextInt function we just passed an argument as
    //week.size which would help us to create a range that is 0 to 6 and get a random integer from it.



}


fun randomfood():String{
    val food=listOf("chicken","pasta","hotdog","pizza",
    "sandwhich","rice")
    
    return food[Random().nextInt(food.size)]
}