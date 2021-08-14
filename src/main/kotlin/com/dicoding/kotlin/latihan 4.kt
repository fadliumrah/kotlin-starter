package com.dicoding.kotlin

fun main(){
    val map= mapOf(
        "jakarta" to "indonesia",
        "london" to "england",
        "tokyo" to "japan"
    )
    val indonesi=map.getValue("jakarta")
    val england=map.getValue("london")
    val japan=map.getValue("tokyo")

    val result="""
        $indonesi ibu kotanya adalah jakarta
        $england ibu kotanya adalah england
        $japan ibu kotanya adalah tokyo
    """.trimIndent()
    println(result)
}