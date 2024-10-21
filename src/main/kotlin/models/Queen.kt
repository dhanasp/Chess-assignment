package org.example.game.models

import org.example.game.org.example.game.models.CellPosition

class Queen : Piece {
    override fun possibleMoves(currentPosition: CellPosition): List<CellPosition> {
        println("Calculating possible moves for Queen at $currentPosition...")
        val cellPositions = verticalMoves(currentPosition)
            .plus(horizontalMoves(currentPosition))
            .plus(diagonalMoves(currentPosition))
            .filter { cellPosition -> ChessBoard.validateCellPos(cellPosition) }
        return cellPositions;
    }

    private fun diagonalMoves(currentPosition: CellPosition): List<CellPosition> {
        return upLeft(currentPosition)
            .plus(downRight(currentPosition))
            .plus(upRight(currentPosition))
            .plus(downLeft(currentPosition))
    }

    private fun upRight(currentPosition: CellPosition): List<CellPosition> {
        return (1..<currentPosition.column).map { i ->
            CellPosition(
                currentPosition.column - i,
                currentPosition.row + i
            )
        }
    }

    private fun downLeft(currentPosition: CellPosition): List<CellPosition> = (1..<currentPosition.row).map { i ->
        CellPosition(currentPosition.column + i, currentPosition.row - i)
    }

    private fun downRight(
        currentPosition: CellPosition,
    ): List<CellPosition> {
        val totalColumns = Columns.entries.size
        val loopcount = totalColumns - currentPosition.row
        return (1..loopcount)
            .map { i ->
                CellPosition(
                    currentPosition.column + i,
                    currentPosition.row + i
                )
            }
    }

    private fun upLeft(currentPosition: CellPosition): List<CellPosition> {
        return (1..<currentPosition.column).map { i ->
            CellPosition(
                currentPosition.column - i,
                currentPosition.row - i
            )
        }
    }

    private fun horizontalMoves(currentPosition: CellPosition): List<CellPosition> {
        val columns = Columns.entries.size
        val left = (1..<currentPosition.row).map { i -> CellPosition(currentPosition.column, i) }
        val right = (currentPosition.row + 1..columns).map { i -> CellPosition(currentPosition.column, i) }
        return left.plus(right)
    }

    private fun verticalMoves(currentPosition: CellPosition): List<CellPosition> {
        val columns = Columns.entries.size
        val up = (1..<currentPosition.column).map { i -> CellPosition(i, currentPosition.row) }
        val down = (currentPosition.column + 1..columns).map { i -> CellPosition(i, currentPosition.row) }
        return up.plus(down)
    }


}