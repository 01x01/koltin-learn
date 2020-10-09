package com.example.koltinlearn

//不可变
fun printlnAll(strings : Collection<String> ){
    for ( s in strings)println(s)
}

// 可变
// 在类上面再添加函数
fun List<String>.getShortWord(shortWord: MutableCollection<String>, maxLength:Int){
    this.filterTo(shortWord){it.length <= maxLength}
    val article = setOf<String>("A","a","an","An","the","The")
    // 可变集合是可以做加减法的
    shortWord -= article
}

fun main() {
    val strings = listOf<String>("one", "two", "Three" )
    // 参数是 Collection<String> 但是传入的是 listOf<String>
    printlnAll(strings)

    val word =  "A long time ago in a galaxy far far away".split(" ")
    val shortWord = mutableListOf<String>()
    word.getShortWord(shortWord,3)
    println(shortWord)
}