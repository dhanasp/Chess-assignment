package models

import org.example.game.models.ChessBoard
import org.example.game.models.Pawn
import org.example.game.org.example.game.models.CellPosition
import org.example.game.org.example.game.models.InvalidCellPosition
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class ChessBoardTest {
    @Test
    fun `should generate board with 8x8 grid`() {
        val chessBoard = ChessBoard().getBoard()

        assert(chessBoard.size == 8)
        assert(chessBoard[0].size == 8)
    }

    @Test
    fun `should test if positions are assigned correctly`() {
        val chessBoard = ChessBoard().getBoard()
        assert(chessBoard[0][0] == "A1")
        assert(chessBoard[0][7] == "A8")
        assert(chessBoard[7][0] == "H1")
        assert(chessBoard[3][5] == "D6")
        assert(chessBoard[7][7] == "H8")
    }

    @Test
    fun `should throw error for invalid row Cell Position`() {
        val exception = assertThrows(InvalidCellPosition::class.java) {
            ChessBoard().possibleMovesFor(Pawn(), "A9")
        }
        assertEquals(exception.message, "Invalid row cell position input")
    }

    @Test
    fun `should throw error for invalid column Cell Position`() {
        val exception = assertThrows(InvalidCellPosition::class.java) {
            ChessBoard().possibleMovesFor(Pawn(), "K1")
        }
        assertEquals(exception.message, "Invalid column cell position input")
    }

    @Test
    fun `should return true for valid cell position`() {
        val cellPos = CellPosition(1, 1)
        assertTrue(ChessBoard.validateCellPosition(cellPos))
    }

    @Test
    fun `should return false for valid cell position`() {
        val cellPos = CellPosition(9, 1)
        assertFalse(ChessBoard.validateCellPosition(cellPos))
    }

}