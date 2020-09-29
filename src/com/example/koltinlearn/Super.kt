package com.example.koltinlearn


open class Rectangle {
    open fun draw(){
        println("Rectangle draw...")
    }
    val borderColor : String get() = "black"
}

interface Polygon{
    fun draw()
}


class FilledRectangle : Rectangle(), Polygon {
    override fun draw() {
        super<Rectangle>.draw()
    }
    val filledColor : String get() = super.borderColor
}

fun main() {
    val p = FilledRectangle()
    p.draw() // Rectangle draw
}