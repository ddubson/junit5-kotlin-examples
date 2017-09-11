package com.ddubson.junit5

import org.junit.jupiter.api.Test
import java.time.Duration.ofMillis
import org.junit.jupiter.api.Assertions.assertTimeout
import org.junit.jupiter.api.Disabled

class TimeoutTest {
    @Test
    fun methodShouldExecuteInLessThan200ms() {
        assertTimeout(ofMillis(200), {
            thisTakes100msToExecute()
        })
    }

    @Test
    @Disabled
    fun methodShouldExecuteInLessThan50ms() {
        println("This should fail!")
        assertTimeout(ofMillis(50), {
            thisTakes100msToExecute()
        })
    }

    private fun thisTakes100msToExecute() {
        println("I'm doing things for 1/10th of a second.")
        Thread.sleep(100)
    }
}

