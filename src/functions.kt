fun main() {
    //Starndard-Library Functions/predefined
    var output = Math.sqrt(144.0)
    println(" The square root of 144 is $output")
    var number = Math.round(45.89)
    println(number)
    school()
    add()//calling a function
    student("Ann","Female",12)
    student("John","male",22)
    employee("Micah",4500,true)


}
//user-defined functions

fun school(){
    println("eMobilis")
}
fun add (){
    var x =3
    var y = 5
    println(x + y)
}

//parameters/variables and arguments/values
fun student(name:String,gender:String,age:Int){
    println("$name is a $gender.$name is $age years old.")

}
fun employee(name:String,salary:Int,disability:Boolean){
    println("$name earns $salary. Has disability:$disability")

}

