package com.ddubson.junit5

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertThrows

class ExceptionTest {
    @Test
    fun theMethodShouldThrowIllegalStateException() {
        assertThrows(IllegalStateException::class.java, {
            iThrowAnException()
        })

        println("It definitely threw that IllegalStateException.")
    }

    private fun iThrowAnException() {
        throw IllegalStateException()
    }
}

