package bot

const val ASSISTANT_NAME = "Karen"
const val BIRTH_DATE = "12.01.2022"

fun main() {
    greeting()
    remindName()
    guessUserAge()
    count()
    test()
    end()
}

private fun greeting() {
    println("Hello! My name is $ASSISTANT_NAME.")
    println("I was created in $BIRTH_DATE.")
    println("Please, remind me your name.")
}

private fun remindName() {
    val name = readln()
    println("What a great name you have, ${name}!")
}

private fun guessUserAge() {
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    // Gets remainders and calculates age
    val (remainder3, remainder5, remainder7) = List(3) { readln().toInt() }
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

private fun count(){
    println("Now I will prove to you that I can count to any number you want.")
    val number = readln().toInt()
    // Counts from 0 to the number entered by the user
    (0..number).forEach {println("$it!")}
}

private fun test() {
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")

    println("1. To repeat a statement multiple times.\n" +
            "2. To decompose a program into several small subroutines.\n" +
            "3. To determine the execution time of a program.\n" +
            "4. To interrupt the execution of a program.")
    // Checks the correct answer
    while(readln().toInt() != 2) { println("Please, try again.") }
}

private fun end() = println("Congratulations, have a nice day!")

