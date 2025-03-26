import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter number")
    var number = read.nextInt()

    if (number == 0 ){
        println("$number is a nuetral number ")

    }
    else if (number  % 2 == 0 ){
        println("$number it is even number")

    }
    else{
        println("$number it is odd")

    }

}

