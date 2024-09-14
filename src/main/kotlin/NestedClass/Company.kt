package com.dicoding.NestedClass

class Company {
    fun sayHello() {

    }
    class Nation(private var name: String){

        fun getName() : String {
            return name
        }
        inner class Continent(private var name: String) {
            fun getName() : String {
                return name
            }
            //kalau kita mempunyai nama method yang sama
            fun printContinentAndNation() {
                println("${this@Nation.getName()} is from ${this.getName()}")
            }
        }
    }
}
fun main(){
    val negara = Company.Nation("Indonesia").Continent("Asian")
    negara.printContinentAndNation()


}