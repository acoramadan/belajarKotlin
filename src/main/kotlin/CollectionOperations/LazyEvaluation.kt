package com.dicoding.CollectionOperations

data class DataUser(val name : String, val address : String)
class LazyEvaluation {
    /*
        Lazy evaluation :
        lazy evaluation berbeda dengan eager evalution yang dimana eager evaluation akan mengevaluasi item  secara
        satu per satu. Sedangkan lazy evaluation akan mengevaluasi item jika benar benar diperlukan.

         Sequences :
    */
}
fun main() {
    val numberList = (1..10000).toList()
    val number : Int = numberList.filter { it % 2 == 0 }.map { it * 2 }.first()
    println("Without Sequences : $number")

    //Sequences
    val numberSequences : Int = numberList.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()
    println("With Sequences : $numberSequences")

    val dicoding = DataUser("Dicoding Indonesia", "Bandung")
    println(dicoding)

    val gacor : (String,Int) -> String = { name, stambuk ->
        "Nama : $name\nStambuk : $stambuk"
    }
    print(gacor("Ahmad Mufli Ramadhan",1302022))
}

fun print(name : String){
    println("Peserta didik baru : ")
    println(name)
}