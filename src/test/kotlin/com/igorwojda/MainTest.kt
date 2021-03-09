package com.igorwojda

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

fun doSth(): Int {
    TODO("Not Implemented")
}

class Test3 {
    @Test
    fun test1() {
        val actual = doSth()
        val expected = 4
        assertEquals(expected, actual)
    }
}