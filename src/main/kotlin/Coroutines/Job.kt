package com.dicoding.Coroutines
import kotlinx.coroutines.*

fun main() =  runBlocking{
    val job = launch(start = CoroutineStart.LAZY) {
        val user = User("Ahmad Mufli Ramadhan", " 123")
        delay(2000L)
        val message : (String,String) -> String = {name,password ->
            "Hello $name this is your password $password"
        }
        println(message(user.name,user.password))
        delay(3000L)
    }
    job.start()
    println("Loading....")
}
class Job {
}
data class User(val name : String, val password : String)