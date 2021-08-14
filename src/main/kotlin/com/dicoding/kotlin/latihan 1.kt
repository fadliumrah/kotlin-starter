package com.dicoding.kotlin

fun main(){
    val nilaiA=101
    val nilaiB=52
    val nilaiC=99

    val result1= calculate(nilaiA,nilaiB,nilaiC)
    val result2= calculate(nilaiA,nilaiB,null)

    val result="""
        ResultA $result1
        ResultB $result2
    """.trimIndent()
    println(result)
}
fun calculate(nilaiA: Int,nilaiB: Int,nilaiC: Int?)=nilaiA+(nilaiB-(nilaiC?:50))