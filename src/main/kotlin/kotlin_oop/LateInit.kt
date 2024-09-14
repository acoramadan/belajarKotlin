package com.dicoding.kotlin_oop


class LateInit {

    /*
        Lateinit maksudnya adalah seperti kita ingin mendeklaraksikan variabel.
        ingat bahwa di kotlin kita harus menginisialisasi nilainya terlebih dahulu
        nah dengan lateinit kita tidak perlu melakukan hal itu.
        catatan : lateinit tidak bisa digunakan dalam tipe data primitif! (int,float,boolean,etc)
    */

    lateinit var name: String
   

}