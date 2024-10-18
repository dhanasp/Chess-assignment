package models

import org.example.game.models.ChessBoard
import org.example.game.models.King
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
    fun `should return valid cell positions moves for king`() {
        val possibleMoves = ChessBoard().possibleMovesFor(King(), "D8")
        val expected = listOf("C8", "C7", "D7", "E7", "E8")
        assertEquals(possibleMoves.size, expected.size)
        assertEquals(possibleMoves.toSet(), expected.toSet())
    }
}