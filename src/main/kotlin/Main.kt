package com.dicoding

import com.dicoding.belajarDelegateClass.hehe
import com.dicoding.Modul1.Kotlin_Fundamental
import com.dicoding.ControlFlow.ControlFlow
import com.dicoding.kotlin_oop.Manusia
fun main() {
    val k = Kotlin_Fundamental()
    val z = ControlFlow()
    val manusia = Manusia()
    println(k.tes("Ahmad"))

    manusia.setNama("Mufli")
    manusia.setUmur(20)
    manusia.setTempatTinggal("Jl Tamalate setapak 22 no 16")
    manusia.setJenisKelamin("Laki-Laki")

    manusia.printManusia()
}