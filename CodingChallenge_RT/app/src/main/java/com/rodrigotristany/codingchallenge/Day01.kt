package com.rodrigotristany.codingchallenge

fun day01(list : MutableList<Int>, k : Int) : Boolean {
    var result : Boolean = false
    var listArray : MutableList<Int> = list.toMutableList()
    for(n in list) {
        listArray.remove(n)
        if(listArray.contains(k-n)) {
            result = true
            break
        }
    }
    return result
}