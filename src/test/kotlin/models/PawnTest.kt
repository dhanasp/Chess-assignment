package models

import org.example.game.models.Pawn
import org.example.game.org.example.game.models.CellPosition
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PawnTest {

    @Test
    fun `should return up move for given cell position`() {
        val pawn = Pawn()
        val positionsForUpMovement = pawn.possibleMoves(CellPosition(4, 3))
        assertEquals(positionsForUpMovement, listOf(CellPosition(5, 3)))
    }

    @Test
    fun `should not return up move for given cell position in case its in the end`() {
        val pawn = Pawn()
        val positionsForUpMovement = pawn.possibleMoves(CellPosition(8, 2))
        assertEquals(positionsForUpMovement, listOf(CellPosition(9,2)))
    }

    @Test
    fun `should not return up move for given cell position in case invalid column`() {
        val pawn = Pawn()
        val positionsForUpMovement = pawn.possibleMoves(CellPosition(8, 9))
        assertEquals(positionsForUpMovement, listOf(CellPosition(9,9)))
    }
}