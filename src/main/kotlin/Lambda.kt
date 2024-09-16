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
typealias number = (Int,Int) -> Int

fun main() {
    val tambah : number = {number1,number2 ->
        number1 + number2
    }
    printPeserta("Ahmad Mufli",130202022) {nama,stambuk ->
        "Nama : $nama\nStambuk : $stambuk"
    }
    printPeserta(scopeFunctional(),130202123) { nama,stambuk ->
        "nama : $nama\nStambuk : $stambuk"
    }
    println(tambah(10,10))
}
