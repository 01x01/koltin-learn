package com.example.koltinlearn

// 默认是 open 可以继承和重载的
interface Browser {
    // 有属性，但是没有值
    val name : String
    // 可以定义具体的方法
    fun open(){
        println("Open Browser")
    }

    // 抽象方法
    fun close()
}

class Chrome (override val name : String) : Browser {
    override fun close() {
        println("chrome close browser")
    }

    override fun open() {
        super.open()
    }
}

interface Named {
    val name : String
}

interface Person : Named {
    val firstName : String
    val lastName : String
    // 不允许赋值，但是运行设置 get 函数
    override val name : String  get() = "$firstName, $lastName"
}

data class Employee (
    override val firstName: String,
    override val lastName: String,
    val position : String
) : Person

interface A {
    fun foo(){println("A interface...")}
}

interface  B {
    fun foo(){println("B Interface")}
}

class C : A,B{
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }
}
fun main() {

}