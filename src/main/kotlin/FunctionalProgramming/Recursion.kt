package com.dicoding.FunctionalProgramming

fun main() {
    println(faktorial(4))
}
// recursion
fun faktorial(number : Int) : Int {
    if (number == 1) {
        return number
    }
   return number * faktorial(number - 1)
}

// tail recursion!
tailrec fun faktorial(n : Int, result : Int = 1) : Int {
    val newResult = n * result
    if (newResult == 1) {
       return newResult
    }
    return faktorial(n - 1, newResult)
}
class Recursion {
    val message = { name : String ->
        "Hello $name"
    }
}
