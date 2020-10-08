package com.example.koltinlearn

abstract class Base1 (val name : String ){

    fun sayHello(){
        println("Hello $name")
    }

    // 不能加大括号
    abstract fun sayHi()
}

abstract  class Base2(val name : String) {}

// 只能继承一个 abstract
class Implement(val firstName : String) : Base1(firstName) {
    override fun sayHi() {
        println("Hi. ")
    }
}

fun main() {
    val p = Implement("john")
    p.sayHello()
    p.sayHi()
}