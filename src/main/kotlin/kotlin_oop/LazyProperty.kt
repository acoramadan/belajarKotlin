package com.dicoding.kotlin_oop

class LazyProperty {
    /*
        Lazy Property berguna untuk variabel konstan saja. nah di kotlin kalau kita ingin membuat variabel
        itu harus di inisialisasi dulu. nah kalau lazy itu dia akan dinisialisasi nilainya ketika dipanggil saja, jika tidak
        maka name akan di anggap tidak ada!
    * */
    val NAME : String by lazy {
        "gacor"
    }

    val NUMBER : Int by lazy{
        2
    }

    val KARAKTER : Char by lazy{
        'A'
    }

    val DECIMAL : Double by lazy{
        4.5
    }

}