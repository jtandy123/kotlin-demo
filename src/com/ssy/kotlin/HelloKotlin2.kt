package com.ssy.kotlin

// import com.ssy.kotlin2.multiply
//import com.ssy.kotlin2.multiply as myMultiply
import com.ssy.kotlin2.*

fun main() {
    val a: Int = 1 // val用来定义常量，相当于Java中的final
    val b = 2 // 类型推断，可省略类型

    var c: Int = 3 // var用来定义变量
    println(c)

    var d = 3
    d = 4

    println(d)

    /*
    *
    * */
    /*

     */
    /*
    /*
    注释可以嵌套
     */
     */

    var x = 10
    var y: Byte = 20
    x = y.toInt() // 赋值操作两边类型必须一致

    println(x)

    println(multiply(2, 3))

    val m = intArrayOf(1, 2, 3)
    // m = intArrayOf(4, 5)
    m.set(0, 4)
    for (item in m) {
        println(item)
    }
}