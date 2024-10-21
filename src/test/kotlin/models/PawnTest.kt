package models

import org.example.game.models.Pawn
import org.example.game.org.example.game.models.CellPosition
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PawnTest {

    val gridSize = 8

    @Test
    fun `should return up move for given cell position`() {
        val pawn = Pawn()
        val positionsForUpMovement = pawn.possibleMoves(CellPosition(3, 4))
        assertEquals(positionsForUpMovement, listOf(CellPosition(3, 5)))
    }

    @Test
    fun `should not return up move for given cell position in case its in the end`() {
        val pawn = Pawn()
        val positionsForUpMovement = pawn.possibleMoves(CellPosition(2, 8))
        assertEquals(positionsForUpMovement, emptyList<CellPosition>())
    }

    @Test
    fun `should not return up move for given cell position in case invalid column`() {
        val pawn = Pawn()
        val positionsForUpMovement = pawn.possibleMoves(CellPosition(9, 8))
        assertEquals(positionsForUpMovement, emptyList<CellPosition>())
    }
}