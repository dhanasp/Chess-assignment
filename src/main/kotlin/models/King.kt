package org.example.game.models

import org.example.game.org.example.game.models.CellPosition

class King : Piece {

    override fun possibleMoves(currentPosition: CellPosition): List<CellPosition> {
        println("Calculating possible moves for Pawn at $currentPosition...")
        return right(currentPosition)
            .plus(left(currentPosition))
            .plus(up(currentPosition))
            .plus(down(currentPosition))
            .plus(upLeft(currentPosition))
            .plus(upRight(currentPosition))
            .plus(downLeft(currentPosition))
            .plus(downRight(currentPosition))
    }

    private fun downRight(currentPosition: CellPosition): List<CellPosition> {
        val cellPos = CellPosition(currentPosition.row + 1, currentPosition.column + 1)
        return when {
            ChessBoard.validateCellPosition(cellPos) -> listOf(cellPos)
            else -> listOf()
        }

    }

    private fun downLeft(currentPosition: CellPosition): List<CellPosition> {
        val cellPos = CellPosition(currentPosition.row - 1, currentPosition.column + 1)
        return when {
            ChessBoard.validateCellPosition(cellPos) -> listOf(cellPos)
            else -> listOf()
        }
    }


    private fun upRight(currentPosition: CellPosition): List<CellPosition> {
        val cellPos = CellPosition(currentPosition.row + 1, currentPosition.column - 1)
        return when {
            ChessBoard.validateCellPosition(cellPos) -> listOf(cellPos)
            else -> listOf()
        }

    }

    private fun upLeft(currentPosition: CellPosition): List<CellPosition> {
        val cellPos = CellPosition(currentPosition.row - 1, currentPosition.column - 1)
        return when {
            ChessBoard.validateCellPosition(cellPos) -> listOf(cellPos)
            else -> listOf()
        }
    }

    private fun up(currentPosition: CellPosition): List<CellPosition> {
        val cellPos = CellPosition(currentPosition.row, currentPosition.column - 1)
        return when {
            ChessBoard.validateCellPosition(cellPos) -> listOf(cellPos)
            else -> listOf()
        }
    }

    private fun down(currentPosition: CellPosition): List<CellPosition> {
        val cellPos = CellPosition(currentPosition.row, currentPosition.column + 1)
        return when {
            ChessBoard.validateCellPosition(cellPos) -> listOf(cellPos)
            else -> listOf()
        }
    }

    private fun left(currentPosition: CellPosition): List<CellPosition> {
        val cellPos = CellPosition(currentPosition.row - 1, currentPosition.column)
        return when {
            ChessBoard.validateCellPosition(cellPos) -> listOf(cellPos)
            else -> listOf()
        }
    }

    private fun right(currentPosition: CellPosition): List<CellPosition> {
        val cellPos = CellPosition(currentPosition.row + 1, currentPosition.column)
        return when {
            ChessBoard.validateCellPosition(cellPos) -> listOf(cellPos)
            else -> listOf()
        }
    }
}
