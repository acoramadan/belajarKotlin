package com.dicoding.CollectionOperations

data class User(val email : String, val password : String, val userName : String)
class Main {

    /*
        filter :
        seperti namanya dia akan memfilter sesuai dengan kondisi yang kita berikan
        jadi hanya yang cocok dengan kondisi kita saja yang akan di tampilkan

        filterNot :
        merupakan kebalikan dari filter. jadi jika cocok dengan kondisi yang diberikan.
        maka numbernya tidak akan di tampilkan

        map :
        fungsi yang membuat collection baru sesuai dengan perubahan yang kita lakukan.
        atau bisa dibilang kita memanipulasi value dalam collection kita

        count :
        yaitu untuk menghitung jumlah elemen yang ada di dalam collection kita

        find :
        untuk mencari nilai sesuai dengan  kondisi yang kita berikan. bedanya dengan map dan
        filter adalah jika ada nilai yang cocok maka nilainya langsung akan di kembalikan
        berbeda dengan fitler yang mengiterasi di setiap nilai

        firstOrNull dan lastOrNull :
        sama seperti find untuk cara kerjanya bedanya adalah kalau first sama dengan find, kalau last dia akang mencari item terakhir

        first dan last :
        akan mencetak angka pertama untuk first dan last akan mencetak angka terakhir saja!. kita juga bisa menambahkan parameter

        sum :
        akan menambahkan seluruh angka di dalam collection

        sorted dan sortedDescending :
        akan mensort data secara ascending untu sorted,
        dan descending untuk sortedDescending
    */

}

fun main() {
    val user = User("Gacor@student.umi.ac.id","13123","Hendrick")
    val idMap : Map<String, User> = mapOf(
        "id_12331" to user
    )

    val listNumber : List<Int> = listOf(1,3,2,1,5,2)
    val mapNumber : Map<Int,Int> = mapOf(
        1 to 3,
        2 to 4,
        5 to 10
    )

    println(listNumber.filter { it == 1 }) // output : 1,1
    println(mapNumber.keys.filter { it %2 == 0 }) // output : 2
    println(listNumber.filterNot { it % 2 == 0 }) // ouput  : 1,3,1,5
    println(listNumber.map { it + 1 }) // output : 2,4,3,2,6,3
    println(mapNumber.count()) // output  : 3
    println(listNumber.count()) // output : 6
    println(listNumber.find{it == 1}) // output : 1

    println(listNumber.lastOrNull{it == 3 })
}