package com.ddubson.junit5

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class ParameterizedTest {
    @ParameterizedTest
    @ValueSource(strings = arrayOf("development", "test", "production"))
    fun environmentsShouldBeIdentifiedProperlyTest(envArgument: String) {
        val envs = listOf("development", "test", "production")

        assertTrue(envs.contains(envArgument))
    }
}