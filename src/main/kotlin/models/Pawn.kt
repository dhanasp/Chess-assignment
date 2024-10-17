package org.example.game.models

import org.example.game.org.example.game.models.CellPosition

class Pawn : Piece {

    override fun possibleMoves(currentPosition: CellPosition): List<CellPosition> {
        println("Calculating possible moves for Pawn at $currentPosition...")
        return listOf()
    }

    override fun up(currentPosition: CellPosition): List<CellPosition> {
        TODO("Not yet implemented")
    }

    override fun down(currentPosition: CellPosition): List<CellPosition> {
        TODO("Not yet implemented")
    }

    override fun left(currentPosition: CellPosition): List<CellPosition> {
        TODO("Not yet implemented")
    }

    override fun right(currentPosition: CellPosition): List<CellPosition> {
        TODO("Not yet implemented")
    }

    override fun upLeft(currentPosition: CellPosition): List<CellPosition> {
        TODO("Not yet implemented")
    }

    override fun upRight(currentPosition: CellPosition): List<CellPosition> {
        TODO("Not yet implemented")
    }

    override fun downLeft(currentPosition: CellPosition): List<CellPosition> {
        TODO("Not yet implemented")
    }

    override fun downRight(currentPosition: CellPosition): List<CellPosition> {
        TODO("Not yet implemented")
    }

}
