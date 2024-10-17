package models

import org.example.game.models.King
import org.example.game.org.example.game.models.CellPosition
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class KingTest {

    @Test
    fun `should return all possible moves for King chessman`() {
        val king = King()
        val possibleMoves = king.possibleMoves(CellPosition(3, 4))

        val expectedMoves = listOf(
            CellPosition(3, 5),
            CellPosition(3, 3),
            CellPosition(2, 4),
            CellPosition(4, 4),
            CellPosition(2, 3),
            CellPosition(2, 5),
            CellPosition(4, 3),
            CellPosition(4, 5),
        )
        assertEquals(possibleMoves.size, expectedMoves.size)
        assertEquals(possibleMoves.toSet(), expectedMoves.toSet())

    }
}