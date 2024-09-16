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

        fold :
        kita bisa dengan mudah melakukan perhitungan setiap nilai yang berada di dalam sebuah collection tanpa harus melakukan iterasi
        item tersebut satu persatu menggunakan fungsi fold.

        drop dan take:
        kita bisa memangkas nilai kita berapa banyak yang kita mau
        contohnya jika saya mempunyai list dengan nilai 1, 2, 3, 4, 5, 6,
        ketika saya memberikan argumen drop 3. maka outputnya akan mulai dari
        4, 5, 6


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

    // fold, drop, dan take

    /*
        coddingan dibawah dapat dilihat bahwa saya memprint current dimana currentnya dimulai dari 2
        dilihat dari argumen yang kita berikan.
        kemudian akan memprint itemmnya, nah itemnya itu sendiri adalah List number
        dan setiap iterasinya currentnya akan ditambah 1

        terdapat juga FOLDRIGHT, cara kerjanya dimulai dari index terakhir
    */
    val number : List<Int> = listOf(3,4,1,2)
    val fold = number.fold(2) { current,it ->
        println("current : $current")
        println("item $it")
        println()
        current+1
    }
    println("fold : $fold")

    val drop = number.drop(2)
    println("drop : $drop") // output 1, 2
    println("dropLast : ${number.dropLast(2)}") // bedanya dia akan mendrop mulai dari belakang atau index belakang... output : 3,4

}