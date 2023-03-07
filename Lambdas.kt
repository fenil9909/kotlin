



fun main(){

  println(lambda1.invoke(7, 8))
  lambda2.invoke()
  println(singleparamlambda.invoke(8))
  println(simplifysingleparamlambda.invoke(9))
  println(lambda6.invoke(45, 5))
 pallindromelambda.invoke("mom")
}


// normal function to perform addition

fun add1(c:Int,d:Int):Int{
    return c+d
}


//now converting this function into a lambda expression


val lambda1={x:Int,y:Int -> x+y}

//now the lambda expression can be of mutliline

val lambda2={
    println("hello welcome to lambda2")
    val a=8
    val b=9
    val c=a+b
    println(c)
}


//singleparameter lambda expression can be written in two ways
//1.
val singleparamlambda={x:Int-> x*x}
//2.
val simplifysingleparamlambda:(Int)->Int={it*it}

// the abov lambdas expression that is singleparam and simplifysingleparam
//returns the same otput.
//it refers to the single parameter used so we do not need to define explicitly
//a single parameter that we need to use.


//defining the type of lambda and its return type

val lambda5:(Int)->Int={x->x*x}

val lambda6:(Int,Int)->Int={x,y->x+y}


//writing a lambda  expression which would take a String and check whether it is pallindrome or not



val pallindromelambda={data:String ->
    val ch=data.toCharArray()
    val index=ch.lastIndex
    val revch=CharArray(data.length)
    var j=0
    for(i in index downTo 0){
        revch[j]=ch[i]
        j++
    }
   val revstring=String(revch)
   println(revstring)
   if(data.equals(revstring)){
    println("Yes")
   }
   else{
    println("No")
   }}




