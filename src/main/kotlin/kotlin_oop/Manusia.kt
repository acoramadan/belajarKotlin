package com.dicoding.kotlin_oop

class Manusia {
    private var nama : String? = null
    private var umur : Int? = null
    private var tempatTingal : String? = null
    private var jenisKelamin : String? = null
    private var value : Any by DelegateClass()
    var x : Any by DelegateClass()
    var y : Any? = null

    fun getNama() : String {
        return nama ?: "";
    }
    fun setNama(nama : String?) {
        this.nama = nama
    }
    fun getUmur() : Int {
        return umur ?: 0
    }
    fun setUmur(umur : Int) {
        this.umur = umur
    }
    fun getTempatTinggal() : String {
        return tempatTingal ?: ""
    }
    fun setTempatTinggal(tempatTinggal : String) {
        this.tempatTingal = tempatTinggal
    }
    fun getJenisKelamin() : String {
        return jenisKelamin ?: ""
    }
    fun setJenisKelamin(jenisKelamin : String) {
        this.jenisKelamin = jenisKelamin
    }

    fun printManusia() {
        println("Nama           : ${getNama()}\n" +
                "Umur           : ${getUmur()}\n" +
                "Tempat Tinggal : ${getTempatTinggal()}\n" +
                "Jenis Kelamin  : ${getJenisKelamin()}\n")
    }

}


