package org.example.game.models

class Pawn : Piece {
    override fun possibleMoves(currentPosition: String): List<String> {
        println("Calculating possible moves for Pawn at $currentPosition...")
        return listOf("A2", "A3", "A4")
    }

}
