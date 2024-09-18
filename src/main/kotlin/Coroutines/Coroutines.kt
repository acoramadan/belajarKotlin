package com.dicoding.Coroutines
import kotlinx.coroutines.*
class Coroutines {
}

suspend fun main() = runBlocking {
    launch {
        val message : (String,String) -> String = { message,name ->
            "Hello $name\n" +
                    "$message "
        }
        val income = async{ getIncome()}
        val capital = async{ getCapital()}
        delay(1000L)
        println(message("welcome to dicoding academy","mufli"))

        println(message("This is your profit = RP.${income.await() - capital.await()}","mufli"))

    }
    println("loading...")
    delay(2000)
}

suspend fun getIncome() : Int {
    delay(3000L)
    return 10000000
}

suspend fun getCapital() : Int {
    delay(3000L)
    return 250000
}