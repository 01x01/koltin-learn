package com.example.koltinlearn

fun main() {
    val numbers = listOf("one","two","three","four","five")
    println(numbers.indexOf("one"))
    println(numbers[2])
    println(numbers.get(3))
    println(numbers.size)

    val numbers2 = listOf("one","two","three","four","five")
    println(numbers == numbers2) // true

    val numbers3 = mutableListOf("one","two","three","four","five")
    numbers3.add("six")
    numbers3.removeAt(0)
    numbers3.remove("one")
    numbers3.reverse()
    numbers3.shuffle()
    println(numbers3)
}