package models

import org.example.game.models.ChessBoard
import org.junit.jupiter.api.Test

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
}