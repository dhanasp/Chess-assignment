package org.example.game.models

import org.example.game.org.example.game.models.CellPosition
import org.example.game.org.example.game.models.InvalidCellPosition

class ChessBoard {

    private var board: Array<Array<String>> = emptyArray()
    private var gridSize = 8

    init {
        board = generateBoard()
    }

    private fun generateBoard(): Array<Array<String>> {
        var generatedBoard = Array(gridSize) { Array(gridSize) { "" } }
        val columnName = listOf("A", "B", "C", "D", "E", "F", "G", "H")
        generatedBoard.forEachIndexed { indexCol, col ->
            col.forEachIndexed { index, _ ->
                col[index] = "${columnName[indexCol]}${index + 1}"
            }
        }
        return generatedBoard
    }

    fun possibleMovesFor(piece: Piece, currentPosition: String): List<String> {
        if (validateCurrentCellPosition(currentPosition)) {
            val possibleMoves = piece.possibleMoves(CellPosition.from(currentPosition))
            possibleMoves.map { move -> CellPosition.cellName(move) }
        } else {
            throw InvalidCellPosition("Invalid row cell position input")
        }

    }

    private fun validateCurrentCellPosition(currentPosition: String): Boolean {
        return currentPosition.length > 1 && isValidColumnPos(currentPosition) && isValidRowPos(currentPosition)
    }

    private fun isValidRowPos(currentPosition: String): Boolean {
        val rowPos = currentPosition.substring(1)
        return rowPos.toInt() in 1..gridSize
    }

    private fun isValidColumnPos(currentPosition: String): Boolean {
        try {
            val column = Columns.valueOf(currentPosition[0].toString()).column
            return column in 1..gridSize
        } catch (_: Exception) {
            throw InvalidCellPosition("Invalid column cell position input")
        }
    }

    fun getBoard(): Array<Array<String>> = board
}
