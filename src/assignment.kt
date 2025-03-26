import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter  first number:")
    var number1 = read.nextInt()


    println("Enter  second number:")
    var number2 = read.nextInt()

        println("Enter  third number:")
    var number3 = read.nextInt()




    if (number1>number2&&number1>number3)
        println("$number1 is greater")
    else if (number2>number1&&number2>number3){
        println("$number2 is greater")
    }
    else{
        println("$number3 is greater")
    }

}
