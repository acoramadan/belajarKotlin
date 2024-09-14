package com.dicoding.Set

data class user (val userName : String, val email : String, val password : String)
class Tes {
}

fun main(){
    val user1 = user("dick the destroyer","dick@destroyer.ac.ph","123Imso")
    val l : List<Any> // 1
    val l2 = listOf(user1,user("pablo","pablo@gmail.com","123"),10)
    val l3 : List<user> = listOf(user1,user("pablo","pablo@gmail.com","123"))

    val pablo = (l2[1] as user).userName // cara 1 : tipe data any
    val emailPablo = l3[0].email // cara 2 : tipe data object user

    println(l2[1])
}