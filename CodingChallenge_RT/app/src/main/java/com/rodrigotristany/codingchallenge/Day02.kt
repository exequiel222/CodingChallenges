package com.rodrigotristany.codingchallenge

fun day02(list : List<Int>) : List<Int> {
    var multList : MutableList<Int> = list.toMutableList()

    return multList.map { mappingFunc(list.filter{x -> it != x}) }
}

fun mappingFunc(cuttedList : List<Int>) : Int = cuttedList.fold(1, {x, y -> x * y})
