package com.dicoding.Generics

fun main () {
    val car = 150
    val motorCycle = 130
    var vehicle = car
    vehicle = motorCycle
    val carList  : List<Vehicle> = listOf(car(200),car(300))
    val vehicleList = carList

    //covariant
    val kandangKucing = Kandang(Cat())
    val kandangBinatang = kandangKucing

    //contravariant
    val penjagaKandang = PenjagaKandang<Animal>()
    val penjagaKucing = penjagaKandang
    var number : Double = 0.0
    var number2 : Double = 0.0

    fun sum() : Double {
        val result : Double = number + number2
        return result
    }


}

abstract class Vehicle (wheel : Int)
class motorCycle(speed: Int) : Vehicle(2)
class car(speed: Int) : Vehicle(4)

open class Animal()
class Cat() : Animal()
class Kandang<out T : Animal>  (private val hewan : T){
    fun dapatkanHewan() : T {
        return hewan
    }
}
class PenjagaKandang<in T : Animal> {
    fun urusKandang(hewan : T) {

    }
}
class tesGeneric<T> {
    var t : T? = null

    fun getT() : T? {
        return t
    }

    fun setT(t : T) {
        this.t = t
    }
}