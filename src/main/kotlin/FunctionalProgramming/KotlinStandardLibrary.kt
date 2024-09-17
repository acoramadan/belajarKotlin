package com.dicoding.FunctionalProgramming


fun main() {
    val mahasiswa = Mahasiswa("Ahmad Mufli Ramadhan","13020202227")

    // let = Menjalankan blok dengan it sebagai objek, mengembalikan hasil blok (atau Unit).
    mahasiswa.let{ value ->
        val message = "Hello ${value.nama}"
        println(message)

    }

    //run = Mirip dengan let, tetapi mengembalikan objek (berguna saat blok perlu memanggil metode objek). dan dia menggunakan this bukan it
    mahasiswa.nama.run{
       val message =  "hello $this"
        println(message)
    }
    //with = Menjalankan blok dengan objek sebagai it, mengembalikan hasil blok.
    with(mahasiswa) {
        val message = "stambuk ${this.stambuk}"
        this.nama = "Gacorku"
    }
    println(mahasiswa.nama)

    val user : Mahasiswa = mahasiswa.apply {
        this.nama = "hello"
        someMethod(this.nama,this.stambuk){nama,stambuk ->
            "Nama : $nama, Stambuk $stambuk$"
        }
    }

    println("${user.stambuk} : ${user.nama}")

    val list : List<Int> = listOf(1,3,3,2,1,4)
    list.also{
        print(it.size)
    }
}
data class Mahasiswa(var nama : String, var stambuk : String)
fun someMethod(nama : String, stambuk : String, name : (String,String) -> String) {
    println("Daftar mahasiswa")
    val biodata = name(nama,stambuk)
}
class KotlinStandardLibrary {

}