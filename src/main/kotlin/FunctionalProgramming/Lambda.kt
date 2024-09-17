package com.dicoding.FunctionalProgramming
/*
    HIGH ORDER FUNCTION
*/
class Lambda {
}
// String dan int merupakan sebuah parameternya, dan tipedata setelah -> merupakan kembaliannya
// HighOrder function
fun printPeserta(nama : String,stambuk : Int , name : (String,Int) -> String) {
    println("Nama Peserta : ")
    println(name(nama,stambuk))
}
//letLambda
fun letLambda(pesan : String?){
    pesan?.let {
        println(pesan)
        val len : Int = pesan.length
        println("Panjang pesan $len")

    } ?: run{
        println("Pesan Kosong!")
    }
}
fun scopeFunctional() : String {
    val name = StringBuilder()

    name.apply {
        name.append("Ahmad Mufli Ramadhan")
    }
    return  name.toString()
}
// typealias digunakan ketika kita memiliki beberapa function type yang sama
typealias number = (Int,Int) -> Int

// Lambda sum
val sum : (Int) -> Int = { value ->
    value + value
}

// Inline function
inline fun printResult(value : Int, sum : (Int) -> Int) {
    val result : Int = sum(value)
    println(result)
}

// highOrder function
fun printResultsum(value : Int, sum : (Int) -> Int) {
    val result : Int = sum(value)
    println(result)
}

// lambda biasa
val printResultSum : (Int, sum : (Int) -> Int) -> Unit = { value : Int, sum ->
    val result : Int = sum(value)
    println(result)
}

fun main() {
    val message = {message : String -> "$message kontol kalian semua"}
    val tambah : number = { number1, number2 ->
        print("Hasil kali : ")
        number1 * number2
    }
    letLambda("hehe")
    /*
        2 cara penulisan dalam menggunakan highorder function
        jika terdapat lambda pada akhir parameter kode, seperti yang anda lihat sum merupakan sebuah  lambda
        nah kita bisa  menggunakan 2 cara
    */

    // cara 1
    printResultSum(10, sum)

    // cara 2
    printResultSum(30) { value ->
        value + value
    }
    printPeserta("Ahmad Mufli",130202022) {nama,stambuk ->
        "Nama : $nama\nStambuk : $stambuk"
    }
    printPeserta(scopeFunctional(),130202123) { nama, stambuk ->
        "nama : $nama\nStambuk : $stambuk"
    }
    println(tambah(10,10))
    println(message("kontol puki"))

    val listNumber : List<Int> = listOf(1,3,4,5,2,3)

    // foreachIndexed dengan menggunakan lambda
    listNumber.forEachIndexed {index, value ->
        println("Nilai list dari index : $index adalah : $value")
    }
}
