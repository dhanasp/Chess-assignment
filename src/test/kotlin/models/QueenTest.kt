package models

import org.example.game.models.Queen
import org.example.game.org.example.game.models.CellPosition
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class QueenTest {

    @Test
    fun `should return possible moves for queen`() {
        val queen = Queen()
        val possibleMoves = queen.possibleMoves(CellPosition(4, 4))
        val expectedMoves = listOf(
            // vertical
            CellPosition(4, 1),
            CellPosition(4, 2),
            CellPosition(4, 3),
            CellPosition(4, 5),
            CellPosition(4, 6),
            CellPosition(4, 7),
            CellPosition(4, 8),
            // horizontal
            CellPosition(1, 4),
            CellPosition(2, 4),
            CellPosition(3, 4),
            CellPosition(5, 4),
            CellPosition(6, 4),
            CellPosition(7, 4),
            CellPosition(8, 4),
            // Diagonal
            CellPosition(1, 1),
            CellPosition(2, 2),
            CellPosition(3, 3),
            CellPosition(5, 5),
            CellPosition(6, 6),
            CellPosition(7, 7),
            CellPosition(8, 8),
            CellPosition(5, 3),
            CellPosition(6, 2),
            CellPosition(7, 1),
            CellPosition(3, 5),
            CellPosition(2, 6),
            CellPosition(1, 7)
        )
        assertEquals(possibleMoves.toSet(), expectedMoves.toSet())
        assertEquals(possibleMoves.size, expectedMoves.size)
    }

    @Test
    fun `should test possible moves for left top corner position`() {
        val queen = Queen()
        val possibleMoves = queen.possibleMoves(CellPosition(1, 1))
        val expectedMoves = listOf(
            //diagonal
            CellPosition(2, 2),
            CellPosition(3, 3),
            CellPosition(4, 4),
            CellPosition(5, 5),
            CellPosition(6, 6),
            CellPosition(7, 7),
            CellPosition(8, 8),
            //Vertical
            CellPosition(1, 2),
            CellPosition(1, 3),
            CellPosition(1, 4),
            CellPosition(1, 5),
            CellPosition(1, 6),
            CellPosition(1, 7),
            CellPosition(1, 8),
            //horizontal
            CellPosition(2, 1),
            CellPosition(3, 1),
            CellPosition(4, 1),
            CellPosition(5, 1),
            CellPosition(6, 1),
            CellPosition(7, 1),
            CellPosition(8, 1)
        )
        assertEquals(expectedMoves.size, possibleMoves.size)
        assertEquals(expectedMoves.toSet(), possibleMoves.toSet())
    }

    @Test
    fun `should test possible moves for right bottom position`() {
        val queen = Queen()
        val possibleMoves = queen.possibleMoves(CellPosition(7, 6))
        val expectedMoves = listOf(
            //diagonal
            CellPosition(5, 8),
            CellPosition(6, 7),
            CellPosition(8, 5),
            CellPosition(8, 7),
            CellPosition(6, 5),
            CellPosition(5, 4),
            CellPosition(4, 3),
            CellPosition(3, 2),
            CellPosition(2, 1),
            //Vertical
            CellPosition(7, 2),
            CellPosition(7, 3),
            CellPosition(7, 4),
            CellPosition(7, 5),
            CellPosition(7, 1),
            CellPosition(7, 7),
            CellPosition(7, 8),
//            //horizontal
            CellPosition(2, 6),
            CellPosition(3, 6),
            CellPosition(4, 6),
            CellPosition(5, 6),
            CellPosition(6, 6),
            CellPosition(1, 6),
            CellPosition(8, 6)
        )
        assertEquals(possibleMoves.toSet(),expectedMoves.toSet())
        assertEquals(expectedMoves.size, possibleMoves.size)
    }
}