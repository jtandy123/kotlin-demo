package com.ssy.kotlin

fun main(args: Array<String>) {
    println("Hello Kotlin!")
    println(sum(1, 2))
    println(sum2(1,2))
    myPrint(2, 3)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun myPrint(a: Int, b: Int) {
    println("$a + $b = ${a + b}") // String template
}