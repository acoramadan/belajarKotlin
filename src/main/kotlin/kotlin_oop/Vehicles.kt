package com.dicoding.kotlin_oop

open class Vehicles(Pharga : Double, asalNegara : String) {
    private var harga : Double = Pharga
    fun getHarga() : Double{
        return harga
    }
}

private class Mobil(name : String?, kecepatan : Int?, merek : String?, harga : Double, asalNegara : String) : Vehicles(harga,asalNegara){

    var name : String?
    var kecepatan : Int?
    var merek : String?
    var isDibeli : Boolean

    init{
        this.name = if(name == null) "kosong" else name
        this.kecepatan = if(kecepatan == null) 0 else kecepatan
        this.merek = if(merek == null) "kosong" else merek
        this.isDibeli = true
    }

    constructor(name : String?, kecepatan : Int?, merek : String?, isDibeli : Boolean,harga: Double,asalNegara: String)
            : this(name,kecepatan,merek,harga,asalNegara) {
        this.isDibeli = isDibeli
    }
}

fun main(){
    val mobil = Mobil("Avanza",150,"Honda",true,16500.00,"Jepang")
    println(mobil.name)
    print(mobil.getHarga())

}