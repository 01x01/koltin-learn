package com.example.koltinlearn

open class Sharp {
    open val verTextCount:Int = 0
    open fun draw(){
        println("Sharp draw..")
    }

    fun fill(){
        println("Sharp fill")
    }
}

// 不可重写 fill 函数
class Circle() : Sharp() {
    override var verTextCount: Int = 10

    override fun draw() {
        println("Circle draw")
    }
}

interface Animal {
    val name : String
}

class Dog(override val name:String):Animal {
    fun callName(){
        println(this.name)
    }
}

fun main() {
    val c : Sharp = Circle()
    c.draw()
    c.fill()

    val dog  : Dog  = Dog("铁柱")
    dog.callName()
}