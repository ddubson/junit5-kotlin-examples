package com.ddubson.junit5

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.function.Executable

class BasicJunit5Test {
    companion object {
        @BeforeAll
        @JvmStatic
        fun beforeAllTestCases() {
            println("Runs once before all test cases.")
        }

        @AfterAll
        @JvmStatic
        fun afterAllTestCases() {
            println("Runs once after all test cases.")
        }
    }

    @Test
    fun simpleTestCase() {
        println("A simple test case.")

        val numberTwo = 2
        assertEquals(2, numberTwo)
    }
}