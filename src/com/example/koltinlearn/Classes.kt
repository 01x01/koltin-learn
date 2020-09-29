package com.example.koltinlearn

class People(val name : String){
    var age : Int = 0
    constructor(name : String, age : Int) : this (name) {
        this.age = age
    }
    init {
        println("Initial code in here...")
    }

}

fun main() {
    val p = People("john")
    val p2 = People("john",18)

    println(p.name)
    println(p2.age)

}