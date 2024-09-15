package com.dicoding.Set

data class user (val userName : String, val email : String, val password : String)
class Tes {
}

fun main(){
    // List
    val user1 = user("dick the destroyer","dick@destroyer.ac.ph","123Imso")
    val l : List<Any> // 1
    val l2 = mutableListOf(user1,user("pablo","pablo@gmail.com","123"),10)
    val l3 : List<user> = listOf(user1,user("pablo","pablo@gmail.com","123"))
    val l4 : List<user> by lazy {
        listOf(user1)
    }
    val pablo = (l2[1] as user).userName // cara 1 : tipe data any
    val emailPablo = l3[0].email // cara 2 : tipe data object user
    println(l2[1])


    //  Set
    val setInteger : Set<user> = setOf(
        user("gacor","gacor@gmail.com","gacor123"),
        user("cukimai","Cukimai123@gmail.com","123cuki")
    )

    // Map

    val mapGacor : Map<user,String> = mapOf(
        user1 to "13123",
        user("gacor","gacor123","memek") to "323233"
    )
}