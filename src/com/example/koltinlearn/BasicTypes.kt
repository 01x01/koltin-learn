package com.example.koltinlearn

fun main() {

    /**
     *  Number
     */

//    val num = 1 // Int
//    val longNumber = 30000000000000000 // Long
//    val longNumber2 = 2L // Long
//    val byteNumber: Byte = 1 // Byte
//
//    println(num::class.java)
//    println(longNumber::class.java)
//    println(longNumber2::class.java)
//    println(byteNumber::class.java)
//
//    val floatNumber: Float = 2.7f // float
//    val doubleNumber = 2.55 // double
//
//    println(floatNumber::class.java)
//    println(doubleNumber::class.java)
      println(1_000_000)
    /**
     * Char
     * */
    println('a')
    println('\u2666')
    println('\u2665')
    println('\u2660')
    /**
     * Boolean
     * */
    println(true)
    println(false)
    println(true && false)
    println(true || false)
    println(!true)

    /**
     * Array
     * */
    val array = arrayOf(1,2,3,4,5)
    for (i in array){
        println(i)
    }

    val arr = Array(5) { i -> i} // 0,1,2,3,4
    for(i in arr){
        println(i)
    }
    /**
     * String
     * */
    val str = "Hello"
    println(str + " World")

    val str2 = "this number is "
    println(str2 + 200)

    val message = """Dear, 
        | Nice to meet you. I come from xiamen university, xxxxxx 
        | Thanks
    """.trimMargin()
    println(message)

    val name = "Joe"
    println("Hello $name")
    println("Hello, ${name + ".Doe" }")
}