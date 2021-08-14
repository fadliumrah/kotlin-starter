package com.dicoding.kotlin


fun main(){
    val result= arrayOf(3,7,7)
    println(asList(4,5,*result,5))
}
fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}


