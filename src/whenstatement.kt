import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter day(number):")
    var day = read.nextInt()

    var result = when(day){
        1 ->" Monday"
        2 ->" Tuesday"
        3 ->" Wednesday"
        1 ->" Thursday"
        1 ->" Friday"
        1 ->" Saturday"
        1 ->" Sunday"
        else -> "Invalid day of the week"

    }
    println("day $day corresponds to $result")








}