package org.example.game

import org.example.game.models.ChessPiece
import org.example.game.models.Game

fun main() {

    val currentPosition = "G1"
    val chessPiece = ChessPiece.PAWN
    val movements = Game().getAllPossibleMovesFor(chessPiece, currentPosition)
    println("Possible movements for ${chessPiece.name} at $currentPosition: $movements")
}