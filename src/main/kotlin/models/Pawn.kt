package org.example.game.models

import org.example.game.org.example.game.models.CellPosition

class Pawn : Piece {

    override fun possibleMoves(currentPosition: CellPosition): List<CellPosition> {
        println("Calculating possible moves for Pawn at $currentPosition...")
        return up(currentPosition)
    }

    fun up(currentPosition: CellPosition): List<CellPosition> {
        val cellPos = CellPosition(currentPosition.row + 1, currentPosition.column)
        return when {
            ChessBoard.validateCellPosition(cellPos) -> listOf(cellPos)
            else -> listOf()
        }
    }
}
