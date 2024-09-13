package com.dicoding.kotlin_oop

import kotlin.reflect.KProperty

class DelegateClass {

    /*
        Delegate Class berfungsi agar tidak ada boilerplate di dalam kode kita
        seperti contohnya setter dan getter. bisa dilihat disini saya membuat 2 function
        satu untuk mengambil nilainya, dan satu untuk memberikan nilainya
    */
    lateinit var value : Any

    operator fun getValue(classRef : Any?, property : KProperty<*>) : Any {
        return value
    }

    operator fun setValue(classRef : Any?, property : KProperty<*>, value : Any) {
        this.value = value
    }
}