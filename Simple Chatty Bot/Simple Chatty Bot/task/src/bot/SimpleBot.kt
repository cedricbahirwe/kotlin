package bot

import java.util.Scanner


val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("A", "2020") // change it as you need
    remindName()
    guessAge()
    count()
    // ...
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    // write your code here
    println("Is `Kotlin` a statically typed language?")
    println("1. True")
    println("2. False")
    var answer = 2

    while (answer != 1) {
        answer = scanner.nextInt()
        if (if (answer != 1) {
            true
        } else {
            false
        }) {
            println("Please, try again.")
        }
    }

}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}