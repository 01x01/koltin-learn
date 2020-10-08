package com.example.koltinlearn

// producer
// 获取 - get

// out 必须参数是  val 不可变，不可设置
class Producer<out T> (val first:T, val last:T){
    fun getSomething():T{
        return first
    }
}

// in
class Consumer <in T> (first: T, lastNum:T){
    fun consum(first:T, last:T) {

    }

}


class ProducerAndConsumer<T,K>(val first: T, val last : K){

}

fun demo(x : Producer <Int>) {
    val obj : Producer<Any> = x
    println(x.first)
    println(x.last)
}
fun main() {
    val producer: Producer<Int> = Producer(1,2)
    demo(producer)

}
