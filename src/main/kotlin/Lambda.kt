package com.dicoding
/*
    HIGH ORDER FUNCTION
*/
class Lambda {
}
// String dan int merupakan sebuah parameternya, dan tipedata setelah -> merupakan kembaliannya
fun printPeserta(nama : String,stambuk : Int , name : (String,Int) -> String) {
    println("Nama Peserta : ")
    println(name(nama,stambuk))
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
val sum : (Int) -> Int = { value ->
    value + value
}
val printResultSum : (Int,sum :(Int) -> Int) -> Unit = {value : Int, sum ->
    println(sum(value))
}
fun main() {
    val message = {message : String -> "$message kontol kalian semua"}
    val tambah : number = {number1,number2 ->
        print("Hasil kali : ")
        number1 * number2
    }
    printResultSum(10,sum)

    printPeserta("Ahmad Mufli",130202022) {nama,stambuk ->
        "Nama : $nama\nStambuk : $stambuk"
    }
    printPeserta(scopeFunctional(),130202123) { nama,stambuk ->
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
