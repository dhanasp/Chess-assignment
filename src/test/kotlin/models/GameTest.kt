package models

import org.example.game.models.ChessPiece
import org.example.game.models.Game
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GameTest {

    @Test
    fun `should return all possible moves for pawn with given cell position`() {
        val game = Game()
        val allPossibleMoves = game.getAllPossibleMovesFor(ChessPiece.PAWN, "G1")
        assertEquals(allPossibleMoves, listOf("G2"))
    }

    @Test
    fun `should return all possible moves for king with given cell position`() {
        val game = Game()
        val allPossibleMoves = game.getAllPossibleMovesFor(ChessPiece.KING, "D5")
        val expected = listOf("C4", "C5", "C6", "D4", "D6", "E4", "E5", "E6")
        assertEquals(allPossibleMoves.toSet(), expected.toSet())
    }


    @Test
    fun `should return all possible moves for Queen with given cell position`() {
        val game = Game()
        val allPossibleMoves = game.getAllPossibleMovesFor(ChessPiece.QUEEN, "G6")
        val expected = listOf(
            "A6", "B6", "C6", "D6", "E6", "F6", "H6", "G1", "G2", "G3", "G4", "G5", "G7", "G8", "H7", "F5", "E4", "D3", "C2", "B1", "F7", "E8", "H5",
        )
        assertEquals(allPossibleMoves.toSet(), expected.toSet())
    }

    @Test
    fun `should not return any possible value in case of invalid cell Position`() {
        val game = Game()
        val allPossibleMoves = game.getAllPossibleMovesFor(ChessPiece.PAWN, "G8")
        assertEquals(allPossibleMoves, emptyList<String>())
    }
}