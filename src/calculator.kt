import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    println("first num:")
    var num = read.nextInt()
    println("operator")
    var operator = readln()
    println("second num:")
    var num2 = read.nextInt()
    var results = when (operator){
        "+" -> num +num2
        "/" -> num / num2
        "*" -> num * num2
        "-" -> num - num2
        else -> "invalid operator"
    }
    println(" The result is $results")
}