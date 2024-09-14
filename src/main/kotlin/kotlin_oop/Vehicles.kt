package com.dicoding.kotlin_oop

open class Vehicles(Pharga : Double, asalNegara : String) {
    private var harga : Double = Pharga
    fun getHarga() : Double{
        return harga
    }
    constructor() : this(0.0,"jakarta")
}
open class tidakgacor() {

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
abstract class Negara (name : String) {
   abstract fun getNegara() : String
   abstract fun getisIzin() : Boolean
}
interface gacor {
    fun apalah() : String
    fun gege() : Int
}

class Perusahaan(name : String, lokasi : String) : Negara(lokasi), gacor{

    var lokasi : String
    var isIzin : Boolean
    private var vehicles = Vehicles()
    override fun getNegara() : String{
        return lokasi
    }
    override fun getisIzin() : Boolean {
        return isIzin
    }
    fun String.printString() : String{
        return "Cuki ngana $this"
    }
    override fun apalah(): String {
        return "Aco".printString()
    }

    override fun gege() : Int {
        return 1 + 1
    }
    fun String.Welcome() : String {
        return "Welcome to the site $this"
    }
    fun getVehicles() : Vehicles{
        return vehicles
    }
    init {
        this.lokasi = lokasi
        this.isIzin = true
    }
    constructor() : this("none","none")
}
fun main(){
    val mobil = Mobil("Avanza",150,"Honda",true,16500.00,"Jepang")
    val perusahaan = Perusahaan()
    println(perusahaan.apalah())
    println(mobil.name)
    print(mobil.getHarga())

}