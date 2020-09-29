package com.example.koltinlearn

fun main() {
    val age : Int = 18
    if (age >= 18 ){
        println("old man")
    }else {
        println("young man")
    }

    val fruit = "apple"
    when (fruit) {
        "apple" -> println("this is apple")
        "orange" -> println(" this is orange")
    }

    var x = 1
    while(x < 10) {
        x++
        println(x)
    }

    do {
        x++
        println(x)
    }while (x < 10)

}

fun select(name : String ) = when (name) {
    "john" -> "john.doe"
    else -> "there are no name matched"
}