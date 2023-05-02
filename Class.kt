


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



