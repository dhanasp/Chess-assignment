package org.example.game.models

import org.example.game.org.example.game.models.CellPosition
import org.example.game.org.example.game.models.InvalidCellPosition

class ChessBoard {

    private var board: Array<Array<String>> = emptyArray()

    init {
        board = generateBoard()
    }

    private fun generateBoard(): Array<Array<String>> {
        var generatedBoard = Array(GRID_SIZE) { Array(GRID_SIZE) { "" } }
        val columnName = Columns.entries.map { x -> x.toString() }
        generatedBoard.forEachIndexed { indexCol, col ->
            col.forEachIndexed { index, _ ->
                col[index] = "${columnName[indexCol]}${index + 1}"
            }
        }
        return generatedBoard
    }

    fun possibleMovesFor(piece: Piece, currentPosition: String): List<String> {
        if (validateCurrentCell(currentPosition)) {
            val possibleMoves = piece.possibleMoves(CellPosition.from(currentPosition))
            return possibleMoves.map { move -> CellPosition.cellName(move) }
        } else {
            throw InvalidCellPosition("Invalid row cell position input")
        }
    }


    private fun isValidRowPos(currentPosition: String): Boolean {
        val rowPos = currentPosition.substring(1)
        return rowPos.toInt() in 1..GRID_SIZE
    }

    private fun isValidColumnPos(currentPosition: String): Boolean {
        try {
            val column = Columns.valueOf(currentPosition[0].toString()).column
            return column in 1..GRID_SIZE
        } catch (_: Exception) {
            throw InvalidCellPosition("Invalid column cell position input")
        }
    }


    private fun validateCurrentCell(currentPosition: String): Boolean {
        return currentPosition.length > 1 && isValidColumnPos(currentPosition) && isValidRowPos(currentPosition)
    }

    fun getBoard(): Array<Array<String>> = board

    companion object {

        private const val GRID_SIZE: Int = 8
        fun validateCellPos(cellPosition: CellPosition): Boolean {
            return cellPosition.column in 1..GRID_SIZE && cellPosition.row in 1..GRID_SIZE
        }
    }
}
