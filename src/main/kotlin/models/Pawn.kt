package org.example.game.models

import org.example.game.org.example.game.models.CellPosition

class Pawn : Piece {

    override fun possibleMoves(currentPosition: CellPosition): List<CellPosition> {
        println("Calculating possible moves for Pawn at $currentPosition...")
        return listOf(right(currentPosition)).filter { cellPosition -> ChessBoard.validateCellPos(cellPosition) }
    }

    private fun right(currentPosition: CellPosition): CellPosition {
        return CellPosition(currentPosition.row + 1, currentPosition.column)
    }
}
