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
fun main() {

    printPeserta("Ahmad Mufli",130202022){nama,stambuk ->
        "Nama : $nama\nStambuk : $stambuk"
    }
}
