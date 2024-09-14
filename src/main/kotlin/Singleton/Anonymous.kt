package com.dicoding.Singleton

abstract class gacor{
    abstract fun sayHello()
}

fun tidakGacor(hehe : gacor){
    hehe.sayHello()
}
class Anonymous {

}

fun interface sangatTidakGacor{
    fun konz()
}

fun sangatMengacorkan(bibi : sangatTidakGacor){
    bibi.konz()
}
fun main(){
    tidakGacor(object : gacor(){
        override fun sayHello() {
            println("CUKINGANA")
        }
    })
   sangatMengacorkan(){
       println("memekoz")
   }
}