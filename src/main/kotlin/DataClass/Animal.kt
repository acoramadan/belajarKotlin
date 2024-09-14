package com.dicoding.DataClass


class Kucing(name : String, umur : Int, bulu : String) {

    private var name : String
    private var umur : Int
    private var bulu : String

    init{
        this.name = name
        this.umur = umur
        this.bulu = bulu
    }

    fun getName() : String {
        return name
    }
    fun getUmur() : Int {
        return umur
    }
    fun getBulu() : String {
        return bulu
    }
}
data class Animal(val name : String, val umur: Int, val JenisBulu : String)

fun main(){
    val kucing = Kucing("Astro",20,"halus")
    val animal = Animal(kucing.getName(),kucing.getUmur(),kucing.getBulu())
    val bulu = animal.component3()

    print(bulu)
}
