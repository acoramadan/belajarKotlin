package com.dicoding.Modul1

import java.time.Year

class Kotlin_Fundamental {
    /*
        safe operator : di kotlin kita tidak bisa mendeklarasi variable.
        nah bagaimana jika kita ingin nilainya kosong dulu dan nanti baru kita beri nilai
        itulah kegunaan safe operator "?". agar kita tercegah dari nullpointer exception
        dan ketika kita memanggil variabel dengan safe operator. kita harus menambahkan tanda tanya
    */
    val nama : String? = null;
    /*
        elvis operator "?:" hampir mirip dengan ternary. jadi ketika ada nilai yang masuk di
        variabel name maka nilai dari len itu adalah panjang dari karakter dari nilai nama
        sedangkan jika variable nama masi kosong maka output yang keluar adalah 0
    */

    val len = nama?.length ?: 0;
    //function di atas merupakan function dengan nilai default di setiap parameter
    fun tes(name : String = "MUFLI", stambuk : String = "13020220227", kelas: String = "A6") : String{
        return "Nama = $name\n" +
                "Stambuk = $stambuk\n" +
                "Kelas = $kelas"
    }
    //vararg seperti parameter array, jadi bisa banyak parameter dalam 1 function. digunakan ketika kita
    // tidak mengetahui berapa parameter yang dibutuhkan
    fun gacor(vararg number : Int) : Int{
        return number.sum();
    }
    
}