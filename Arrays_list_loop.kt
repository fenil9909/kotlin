import java.util.Arrays

fun main(){

    //static list that can be created using
    // listof method

    val school=listOf("sc1","sc2","sc3")
    println(school)
    //the one thing about this type of list is that
    // it cannot be changed once it is created

    // now if we need a list that has the capability of creating changes then we can use
    //mutable lists 

    val newlist=mutableListOf("tuna","salmon","shark")
    println(newlist)

    newlist.add("whale")
    println(newlist)
    newlist.remove("salmon")
    println(newlist)
    newlist.removeAt(0)
    newlist.add(0, "nimo")
    println(newlist)

    //Array in kotlin

    //creating an array using arrayOf method

    val sports=arrayOf("cricket","volleyball","football")
    println(Arrays.toString(sports))

    //Loops in kotlin

    //creating an array and traversing through each element:

    val team=arrayOf("t1","t2","t3")

    for(i in team){
        println(i)
    }

    //traversing the array along with their indexes:

    for((i,e) in team.withIndex()){
        println("item at $i is $e")
    }


    

}