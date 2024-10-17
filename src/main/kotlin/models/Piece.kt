package org.example.game.models

import org.example.game.org.example.game.models.CellPosition

interface Piece {
    fun possibleMoves(currentPosition: CellPosition): List<CellPosition>

}
