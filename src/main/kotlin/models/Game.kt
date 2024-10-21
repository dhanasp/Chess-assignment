package org.example.game.models

class Game {

    private var chessboard: ChessBoard

    init {
        println("Starting game...")
        chessboard = ChessBoard()
    }

    fun getAllPossibleMovesFor(pieceName: ChessPiece, currentPosition: String): List<String> {
        val piece = getPieceFromName(pieceName)
        return chessboard.possibleMovesFor(piece, currentPosition)
    }

    private fun getPieceFromName(pieceName: ChessPiece): Piece {
        return when (pieceName) {
            ChessPiece.PAWN -> Pawn()
            ChessPiece.QUEEN -> Queen()
            ChessPiece.KING -> King()
        }
    }
}