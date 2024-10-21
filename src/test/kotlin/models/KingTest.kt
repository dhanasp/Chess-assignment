package models

import org.example.game.models.King
import org.example.game.org.example.game.models.CellPosition
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class KingTest {

    @Test
    fun `should return all possible moves for King chessman`() {
        val king = King()
        val possibleMoves = king.possibleMoves(CellPosition(4, 3))

        val expectedMoves = listOf(
            CellPosition(5, 3),
            CellPosition(3, 3),
            CellPosition(4, 2),
            CellPosition(4, 4),
            CellPosition(3, 2),
            CellPosition(5, 2),
            CellPosition(3, 4),
            CellPosition(5, 4),
        )
        assertEquals(possibleMoves.size, expectedMoves.size)
        assertEquals(possibleMoves.toSet(), expectedMoves.toSet())

    }
}