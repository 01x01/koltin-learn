package com.example.koltinlearn

// 定义函数
fun greet(name : String ) = "Congratulation! $name"
fun greetOthers(name : String) : String{
    return "Congratulation! $name"
}

// 函数的参数

// 默认参数
fun greets(name:String = "john") : String {
   return "Congratulations! $name"
}

// 可变参数
fun maxValue(vararg numbers : Int) : Int {
    var large = Int.MIN_VALUE
    for(num in numbers){
        large = if (num > large) num else large
    }
    return large
}


fun main() {
    println(greet("john"))
    println(greetOthers("jack"))
    println(maxValue(1,2,3,4,5))

    // 解构
    // 这里必须要使用 intArrayOf 不然会出现类型不匹配的错误
    val arrs = intArrayOf(1,2,3,4,5)
    println(maxValue(*arrs))
}