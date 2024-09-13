package com.dicoding.ControlFlow

class ControlFlow {
    val PI = 3.14


    var angka  = if(PI == 3.14){
        "Angka PI"
    }else{
        "bukan angka PI"
    }

    // when adalah switch statement di kotlin
    var validasi : String? =
        when(angka){
            is String -> "$angka adalah String"
            else -> "$angka bukanlah tipe data String"
        }

    fun tes(){
        var count = 0;
        while(count <= 10){
            count++
            println("tidak gacor")
        }
        count = 0;
        do {
            count++;
            println("sangat gacor")
        }while(count <= 11)

    }
    fun hehe(i : Int){
       var ranges = 0..5;
         loop@ for(i in ranges){
            for(j in ranges){
                print("$j")
                break@loop
            }
        }

    }
}