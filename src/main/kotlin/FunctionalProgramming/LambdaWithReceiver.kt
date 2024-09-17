package com.dicoding.FunctionalProgramming

fun main() {
    buildString {
        append("gacor ")
        append("cukimai")
    }
    println(buildString {
        append("gacor ")
        append("cukimai")
    })
}
class LambdaWithReceiver {

    fun buildString(action : StringBuilder.() -> Unit) : String {
        val stringBuilder = StringBuilder()
        stringBuilder.action()
        return stringBuilder.toString()
    }

}
