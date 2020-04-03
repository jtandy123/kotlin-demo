package com.ssy.kotlin

import java.lang.NumberFormatException

fun main() {
    println(convert2Int("12"))

    printMultiply("2", "3")
    printMultiply("2", "a")
}

fun convert2Int(str: String): Int? { // ?表示结果可能为null，没有?，结果类型必须为Int
    try {
        return str.toInt()
    } catch (ex: NumberFormatException) {
        return null
    }
}

fun printMultiply(a: String, b: String) {
    val a2Int = convert2Int(a)
    val b2Int = convert2Int(b)

    if (null != a2Int && null != b2Int) {
        println(a2Int * b2Int)
    } else {
        println("param not int")
    }
}

fun printMultiply2(a: String, b: String) {
    val a2Int: Int? = convert2Int(a)
    val b2Int: Int? = convert2Int(b)

//    println(a2Int * b2Int) // Int?类型不能直接相乘

//    if (null == a2Int) {
//        println("param not int")
//    } else if (null == b2Int) {
//        println("param not int")
//    } else {
//        println(a2Int * b2Int)
//    }
}