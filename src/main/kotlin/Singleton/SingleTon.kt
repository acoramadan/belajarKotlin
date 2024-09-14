package com.dicoding.Singleton

class SingleTon  {
    // companion ini baru mirip kayak static. gg emang
    companion object{
        fun sangatMenyenangkan() {
            println("Sangat menyenangkan bukan belajar bahasa busuk!")
        }
    }
}
//gilak ini hampir mirip sama static di java, bedanya ini bentuknya object bukan kelas adik2
object Singletons {
    var kata = "Gacor"
    fun gacor() {
        println("Sangat $kata")
    }

    fun tidakGacor() {
        println("Sangat Tidak $kata")
    }
}

fun main(){
    Singletons.tidakGacor()
    Singletons.gacor()
    SingleTon.sangatMenyenangkan()
}