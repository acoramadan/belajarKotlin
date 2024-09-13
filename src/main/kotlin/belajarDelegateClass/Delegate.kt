package com.dicoding.belajarDelegateClass

import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class Delegate {
    private var value : Any = "Default"

    operator fun getValue(classRef : Any, property: KProperty<*>) : Any {
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue : Any) {
        this.value = newValue
    }
}

class Animal {
    var nama : Any by Delegate()
    var jenis : Any by Delegate()
    var umur : Any by  Delegate()
}