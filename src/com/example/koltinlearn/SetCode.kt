package com.example.koltinlearn

fun main() {
    val set1 = setOf(1,2,3,4)
    val set2 = setOf(4,3,2,1)
    println(set1 == set2) // true

    println(set1.first())
    println(set1.last())

}