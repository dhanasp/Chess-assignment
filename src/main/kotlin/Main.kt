package org.example.game

import org.example.game.models.ChessPiece
import org.example.game.models.Game

fun main() {
    val movements = Game().getAllPossibleMovesFor(ChessPiece.PAWN, "D4")
    println("Possible movements for Knight at D4: $movements")
}