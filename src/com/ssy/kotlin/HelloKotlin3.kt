package com.ssy.kotlin

fun main() {
//    var x = 10
//    var y = 20
//
//    var max: Int
//    var min: Int
//
//    if (x > y) {
//        max = x
//        min = y
//    } else {
//        max = y
//        min = x
//    }
//
//    println("max = $max, min = $min")


//    var x = 10
//    var y = 20
//
//    var max = if (x > y) x else y
//    var min = if (x > y) y else x
//
//    println("max = $max, min = $min")


    var x = 10
    var y = 20

    var max = if (x > y) { // if-else代码块的返回值：最后一行表达式的值
        println("x > y")
        x
    } else {
        println("x <= y")
        y
    }

    var min = if (x > y) y else x

    println("max = $max, min = $min")
}