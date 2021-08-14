package com.dicoding.kotlin

fun main(){
    val number=1.rangeTo(100)
    for (angka in number){
        if (angka%2==0)continue
        else if (angka>15)break
        val result=angka*(angka+10)
        println("range result is $result")
    }
}