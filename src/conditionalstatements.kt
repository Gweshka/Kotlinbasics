 import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter toom temperature")
    var temperature = read.nextInt()

    if (temperature< 25 ){
        println("it is called")

    }
    else
        println("It is hot")
}