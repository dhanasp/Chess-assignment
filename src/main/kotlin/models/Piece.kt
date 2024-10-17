package org.example.game.models

interface Piece {
    fun possibleMoves(currentPosition: String) : List<String>
}
