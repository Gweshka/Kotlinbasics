fun main() {
    //while loop
    var number = 20
    while (number <= 25 ){
        println("number :$number")

        number++
    }

    var num = 5
    while(num >= 0){
        println("num : $num")
        num--
    }
    // do...while loop

    var x = 30
    do{
        println("number is $x")
        x ++
    }
        while (x <= 35)


 // for loop
        for (a in 100..105){
            println("number is $a")
        }
    for (letter in 'a'..'d') {
        println("My letter is $letter")
    }

    //break
    for(b in 70..75){
        if ( b == 73){
            break
        }

        println("number is $b")
    }
    //continue

    for (character in 'd'..'h'){
        if(character == 'f'){
            continue
        }
        println("character is $character")
    }






}