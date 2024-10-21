package org.example.game

import org.example.game.models.ChessPiece
import org.example.game.models.Game

fun main() {
    val movements = Game().getAllPossibleMovesFor(ChessPiece.QUEEN, "C2")
    println("Possible movements for Knight at E4: $movements")
}