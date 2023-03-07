



//higher order function is the type of function that accepts a function
//as an argument or return a function or both





//1.storing a function in a variable


fun main(){

    calculate(5,7,::add,::subtract,::mulitply,::divide)
}



fun add(a:Int,b:Int):Int{
    return a+b
}

fun subtract(a:Int,b:Int):Int{
    return a-b
}

fun mulitply(a:Int,b:Int):Int{
    return a*b
}

fun divide(a:Int,b:Int):Int{
    return a/b
}


// 2. we would create an higher order function which would be 
//taking a function as an input parameter:


fun calculate(a:Int,b:Int,ad:(Int,Int) -> Int,st:(Int,Int)-> Int,
mt:(Int,Int) -> Int,dv:(Int,Int) -> Int){

    val result=ad(a,b)
    val subresult=st(a,b)
    val mulresult=mt(a,b)
    val divresult=dv(a,b)
    println("addition is $result  subtraction is $subresult  multiply is $mulresult   Division is $divresult")
    
}

//note whenever we are creating a higher order function of the type 
//where a function would be taking another function as the input
//parameter then we can only pass that function as an input which
//would be having the same structure as the function passed as an parameter
//during the creation of that higherorder function


//let us take an example here the add function is similar to the fn 
//function so we were able to pass it as add function is having the same
//structure as the fn function which is been passed as an parameter in the calculate function


//Higher order functions make the code conise and instead of calling
//multiple functions individually we can call only one function
//which would perform the task of all the functions.

//In above example the calculate function is performing
//add,subtract,multiply,divide functions alone instead of calling 
//individual functions.
