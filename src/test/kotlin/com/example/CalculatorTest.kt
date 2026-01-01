package com.example

import org.example.com.example.Calculator
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculatorTest {

    val calculator = Calculator()

    @Test
    fun testAdd() {
        val result = calculator.add(2, 3)
        assertEquals(5, result)
    }
}
