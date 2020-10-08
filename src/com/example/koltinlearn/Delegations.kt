package com.example.koltinlearn


interface Worker{
    fun work()
    fun takeVacation()
}

class JavaProgramer (val name : String, var age : Int) : Worker {
    override fun work() {
        println("Write Java code....")
    }

    override fun takeVacation() {
        println("Java Programer is taking vacation")
    }
}

class CSharpProgramer (val name : String, var age : Int) : Worker {
    override fun work() {
        println("Write C# code....")
    }

    override fun takeVacation() {
        println("CSharp Programer is taking vacation")
    }
}

class Manager(val name : String, var age : Int, val staff : Worker) : Worker by staff

fun main() {
    val javaProgramer = JavaProgramer("jack",20)
    val manager = Manager("john", 55, javaProgramer)
    manager.work()
}