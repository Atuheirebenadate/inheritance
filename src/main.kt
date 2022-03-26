fun main(){
    var doctor=Doctor("caro",37)
    var banker=Banker("mathew",4)
    var farmer=Farmer("martin",35)
    farmer.eat()
    banker.eat()
    doctor.introduction()
    doctor.introduction()



}
 open class person(var name: String,var age: Int){
    fun talk(words:String) {
        println(words)
    }


  open  fun eat(){
        println("yum")

    }
    fun sleep(){
        println("zzzzzz")
    }
     fun introduction(){
         println("hi my Dr $name")
         println("hi dr $name am sick")

     }


}
class Banker( name:String, age:Int):person(name, age) {
    fun countMoney(notes: Array<Int>): Int {
        var sum = 0
        notes.forEach { notes ->
            sum+=notes
        }
        return  sum
    }
}
class Doctor( name: String,age: Int):person(name,age) {

    fun treatPatient(patint:String,disease:String){


    }

}

class Farmer( name: String,age: Int):person(name,age) {


        fun caltivationLand() {
            println("dididididi")
        }

    override fun eat() {
        super.eat()
    println("i am eating all food that i have grown")
    }
    }
//if you remove supper over go the parents inheritance