package com.example.koltinlearn

import java.lang.RuntimeException

// 封装

class Address {
    public var name = "john"
        private set(value) {
            field = if (field == "") throw RuntimeException("Invalid name!") else value
        }
        get() {
            return field + "***"
        }
    var street = "simingqu"
}

fun main() {
    val a = Address()
    println(a.name)

}