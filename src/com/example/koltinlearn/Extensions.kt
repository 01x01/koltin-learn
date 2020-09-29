package com.example.koltinlearn

open class Phone

fun Phone.getName() = "Phone"

val Phone.year : Int get() = 2019

fun main() {
    val p = Phone()
    println(p.getName())
    println(p.year)
}