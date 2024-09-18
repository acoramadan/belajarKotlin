package com.dicoding.Generics

fun main () {
    val car = 150
    val motorCycle = 130
    var vehicle = car
    vehicle = motorCycle
    val carList  : List<Vehicle> = listOf(car(200),car(300))
    val vehicleList = carList
}
class Generic {
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


class tesGeneric<T> {
    var t : T? = null

    fun getT() : T? {
        return t
    }

    fun setT(t : T) {
        this.t = t
    }
}