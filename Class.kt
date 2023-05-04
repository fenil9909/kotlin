


class Aquarim {

    var width:Int=100
    var color:String="Black"


    fun BuildAquarim(){
        println("The width of the Aquarim is $width and color is "+color)
    }
}



fun main(){
    
    val myAquarim=Aquarim()
    myAquarim.width=80
    myAquarim.BuildAquarim()


    val myteam=Football("Real Madrid","Benzema")
    myteam.createFootballTeam()



   val myvolleyball=Volleyball("USA Volleyball","David Smith")
 myvolleyball.createvolleyballteam()


  Software("Kotlin")
   Playername("Benzema")

   val cricket=Cricket()
   cricket.batname="gray nicholes"
   println(cricket.batname)


}


// A class with Constructor invocation:
//1. First case it has some properties direclty declared
//2.Second case is that it has some parameters which if we want to access need to change them to properties

class Football(var club_name:String,var Captain:String){

    fun createFootballTeam(){
        println("Your team name is "+club_name+"and captain name is "+Captain)
    }
}


// class having some parameters,accessed by converting them to properties
class Volleyball(Name_ofClub:String,playername:String){

     var name=Name_ofClub
     var pname=playername

     fun createvolleyballteam(){
        println("Your team name is $name and your player name is $pname")
     }
}


// If we want to execute something when our constructor is been
// called then we can use the init block



class Software(val nameofsoftware:String){

    init{
        println("Name of the software is $nameofsoftware")
    }

}


// Concept of Secondary Constructor:




class Playername(val name:String,var age:Int){

    init{
        println("Name of the player is $name and the age is $age")
    }

    constructor(playername:String):this(playername,15)


    //The secondary constuctor allowed us in here to create the 
    // object for the Playername class without providing the value for
    //the age property.

}


// Now the flow of the code is that if
//1.we create a person object which have values of both name and age parameter
// then the primary constructor is called because of the name and age parameter

//2.if we create a object with only passing the name parameter then the secondary constructor is called first
// which in turns calls the primary constructor for the name property and providing the deafult value for the age which is been passed to it.


// This is how it lets us to create the object for a class in whichever way we want.





