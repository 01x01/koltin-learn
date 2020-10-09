package com.example.koltinlearn

fun main() {
    val numbersMap = mapOf("key1" to 1, "key2" to 2 , "key3" to  3)
    println("All keys is ${numbersMap.keys}")
    println("All values is ${numbersMap.values}")
    println(numbersMap.containsKey("key1"))
    println(numbersMap.containsValue(1))
    println(numbersMap.get("key1")) // 1
    println(numbersMap.getOrDefault("key4",4))

    val map2 = mutableMapOf("key1" to 1, "key2" to 2 , "key3" to  3)
    map2.put("key4", 4)
    map2["key5"] = 5
    println(map2)
    map2.remove("key1")
    map2.replace("key2",10)
    println(map2)


}