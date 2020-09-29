package com.example.koltinlearn

open class Base(p : Int) // open for inherits

// 子类需要在主构造函数中初始化父类
class Derived (p: Int) : Base(p)

// 如果主构造函数中没有初始化父类，可以在第二构造函数中初始化
class Derived2 : Base {
    constructor( p :Int) : super(p)
    constructor(name:String, p:Int) : this(p){}
}

fun main() {
    val d = Derived2(10)
    val d2 = Derived2("test",10)
}