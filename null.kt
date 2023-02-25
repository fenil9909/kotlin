
fun main(){
  //  var rocks:Int=null
    //here we cannnot have null values
    //for the not null datatypes
    //now if at some point your program demands to have a null value
    //for a not null datatype then in kotlin we can explicitly define nullability for that particular variable


    var rocks:Int?=null
    //this code block will not give errors.

    //use of ? operator decreasing the syntax:

    var fishfood=6
    if(fishfood!=null){
        fishfood=fishfood.dec()
        println(fishfood)
    }

    //the above code can be simplifyied:

    var newfishfood:Int?=6
    newfishfood=null
    var result=newfishfood?.dec()
    println(result)

    //this code is checking whether the newfishfood variable
    //is null or not if not then it would decrement it by 1

    
    //Not null assertion:
    // we can use the bang operator !! for indicating that a variable cannot have null values:



}