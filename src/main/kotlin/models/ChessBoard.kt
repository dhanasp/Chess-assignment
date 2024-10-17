package org.example.game.models

class ChessBoard {

    init {
        generateBoard()
    }

    private fun generateBoard() {
        println("Generating chess board...")
    }

    fun possibleMovesFor(piece: Piece, currentPosition: String): List<String> {
        return piece.possibleMoves(currentPosition)
    }
}
