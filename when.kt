
fun main() {
    
     var numberoffish=7

    if(numberoffish==7){
        println("you are at 7th fish")
    }
    else{
        if(numberoffish==8){
            print("you are at 8th fish")
        }
    }
    // the above code can be reduced by using the when statement.
    
     
    numberoffish=4
    when(numberoffish){
        4 -> println("4th")
        5 -> println("5th")
    }

    
}