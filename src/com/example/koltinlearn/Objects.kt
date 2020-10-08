package com.example.koltinlearn

/*
* @Description: Objects 
* @author: anonymous
* @Date: 2020/10/1
*/

open class X(x: Int) {
    public open val y: Int = x
}

interface Y { /*...*/ }


fun foo(){
    val abc = object {
        var x : Int  = 0
        var y : Int = 10
    }

    println(abc.x +  abc.y )
}

class Objects {
    private fun foo() = object  {
        val x : Int = 0
    }

    fun publicFoo() = object  {
        val x : String = "Hello"
    }
    fun boo() {
        val x1 = foo().x
        // error val publicFoo().x
    }
}

class MyClass {
    companion object Factory {
        fun create():MyClass =  MyClass()
    }
}
class Myclass2 {
    companion object {
        fun create():Myclass2 = Myclass2()
    }
}
interface Factory<T>{
    fun creat():T
}

class Myclass3{
    companion object : Factory<Myclass3> {
        override fun creat(): Myclass3 {
            return Myclass3()
        }
    }
}

fun main() {
    val ab: X = object : X(1), Y {
        override val y = 15
    }
    println(ab.y)

    println(MyClass.create())
    println(Myclass2.Companion)
    println(Myclass2.create())
    val x = MyClass
    println(x.create())
    Myclass3.creat()
}