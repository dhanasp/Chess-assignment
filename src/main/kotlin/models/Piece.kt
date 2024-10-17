package org.example.game.models

import org.example.game.org.example.game.models.CellPosition

interface Piece {
    fun possibleMoves(currentPosition: CellPosition): List<CellPosition>

    fun up(currentPosition: CellPosition): List<CellPosition>

    fun down(currentPosition: CellPosition): List<CellPosition>

    fun left(currentPosition: CellPosition): List<CellPosition>

    fun right(currentPosition: CellPosition): List<CellPosition>

    fun upLeft(currentPosition: CellPosition): List<CellPosition>

    fun upRight(currentPosition: CellPosition): List<CellPosition>

    fun downLeft(currentPosition: CellPosition): List<CellPosition>

    fun downRight(currentPosition: CellPosition): List<CellPosition>
}
