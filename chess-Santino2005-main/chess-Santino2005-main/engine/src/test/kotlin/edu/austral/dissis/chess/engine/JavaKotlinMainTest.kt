package edu.austral.dissis.chess.engine

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JavaKotlinMainTest {
    @Test
    fun `test getMessage`() {
        assertEquals("Hello      World!", KotlinMain.getMessage())
    }
}
