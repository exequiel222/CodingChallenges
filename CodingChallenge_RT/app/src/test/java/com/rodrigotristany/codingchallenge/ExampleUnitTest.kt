package com.rodrigotristany.codingchallenge

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun Day01IsCorrect() {
        var result : Boolean = day01(mutableListOf(-1,-2,2,5,4,10,20,5,7), 500)
        assertEquals(false, result)
    }

    @Test
    fun Day02IsCorrect() {
        var result = day02(mutableListOf(-1,2,3,-4))
        assertEquals(mutableListOf(-24,12,8,-6), result)
    }

    @Test
    fun Day03IsCorrect() {
        var result = serialize(MyNode("root", MyNode("left", MyNode("left.left")), MyNode("right", MyNode("right.left"), MyNode("right.right"))))
        //println(result.split(",", limit = 2))
        var myNode = deserialize(result)
        println(myNode.right?.right?.value)
    }
}
