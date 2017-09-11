package com.ddubson.junit5

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

class GroupedAssertionsTest {
    @Test
    fun whenAssertionsAreGroupedTogether() {
        Assertions.assertAll("Addition asserts",
                Executable {
                    println("[${Thread.currentThread().name}] first assert.")
                    Assertions.assertEquals(5, 2 + 3)
                },
                Executable {
                    println("[${Thread.currentThread().name}] second assert.")
                    Assertions.assertEquals(10, 5 + 5)
                }
        )
    }
}