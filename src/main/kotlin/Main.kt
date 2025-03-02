package org.example

fun main() {
    val AGE_OF_MAJORITY = 18
    println("Enter your age:")
    val age = readln().toInt()

    if (age >= AGE_OF_MAJORITY) {
        println("You are of the legal age to drive.")
    } else {
        println("You are not of the legal age to drive.")
    }
}
