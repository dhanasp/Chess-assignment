package org.example.game.models

class ChessBoard {

    private var board: Array<Array<String>> = emptyArray()

    init {
        board = generateBoard()
    }

    private fun generateBoard(): Array<Array<String>> {
        var generatedBoard = Array(8) { Array(8) { "" } }
        val columnName = listOf("A", "B", "C", "D", "E", "F", "G", "H")
        generatedBoard.forEachIndexed { indexCol, col ->
            col.forEachIndexed { index, _ ->
                col[index] = "${columnName[indexCol]}${index + 1}"
            }
        }
        return generatedBoard
    }

    fun possibleMovesFor(piece: Piece, currentPosition: String): List<String> {
        return piece.possibleMoves(currentPosition)
    }

    fun getBoard(): Array<Array<String>> = board
}
