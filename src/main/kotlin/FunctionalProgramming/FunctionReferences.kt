package com.dicoding.FunctionalProgramming

fun main() {
    val f = FunctionReferences()
    val list : List<Int> = listOf(1,3,2,4,2,10,4,3,6,4,5,7,9,41)
    f.printCuy()
    val even = list.filter(::isEvenNumber)
    println(even)

}
fun isEvenNumber(number : Int) : Boolean = number % 2 == 0
fun setKelas(stambuk : String) {
    fun getKelas(stambuk: String) {

    }
}
class FunctionReferences {
    // disini saya membuat lambda yang langsung mereference kepada function, makanya dinamakan functionReferences
    val sum : (Int, Int) -> Int = ::tambah
    fun tambah(val1 : Int, val2 : Int) : Int {
        return val1 + val2
    }
    fun printCuy() {
        println(sum(8,8))
    }

}