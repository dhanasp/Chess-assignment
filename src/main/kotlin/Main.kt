package org.example.game

import org.example.game.models.ChessPiece
import org.example.game.models.Game

fun main(args: Array<String>) {
    val chessPiece = ChessPiece.valueOf(args[0].uppercase())
    val currentPosition = args[1]
    val movements = Game().getAllPossibleMovesFor(chessPiece, currentPosition)
    println("Possible movements for ${chessPiece.name} at $currentPosition: $movements")
}