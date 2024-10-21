package org.example.game.models

import org.example.game.org.example.game.models.CellPosition

class King : Piece {

    override fun possibleMoves(currentPosition: CellPosition): List<CellPosition> {
        println("Calculating possible moves for King at $currentPosition...")
        return listOf(
            right(currentPosition),
            left(currentPosition),
            up(currentPosition),
            down(currentPosition),
            upLeft(currentPosition),
            upRight(currentPosition),
            downLeft(currentPosition),
            downRight(currentPosition)
        ).filter { cellPosition -> ChessBoard.validateCellPos(cellPosition) }
    }

    private fun downRight(currentPosition: CellPosition): CellPosition {
        return CellPosition(currentPosition.row + 1, currentPosition.column + 1)
    }

    private fun downLeft(currentPosition: CellPosition): CellPosition {
        return CellPosition(currentPosition.row - 1, currentPosition.column + 1)
    }

    private fun upRight(currentPosition: CellPosition): CellPosition {
        return CellPosition(currentPosition.row + 1, currentPosition.column - 1)
    }

    private fun upLeft(currentPosition: CellPosition): CellPosition {
        return CellPosition(currentPosition.row - 1, currentPosition.column - 1)
    }


    private fun up(currentPosition: CellPosition): CellPosition {
        return CellPosition(currentPosition.row, currentPosition.column - 1)
    }

    private fun down(currentPosition: CellPosition): CellPosition {
        return CellPosition(currentPosition.row, currentPosition.column + 1)
    }

    private fun left(currentPosition: CellPosition): CellPosition {
        return CellPosition(currentPosition.row - 1, currentPosition.column)
    }

    private fun right(currentPosition: CellPosition): CellPosition {
        return CellPosition(currentPosition.row + 1, currentPosition.column)
    }
}
