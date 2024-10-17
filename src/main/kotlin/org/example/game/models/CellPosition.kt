package org.example.game.org.example.game.models

import org.example.game.models.Columns

data class CellPosition(
    val row: Int,
    val column: Int
) {
    companion object {
        fun from(currentPosition: String): CellPosition {
            return CellPosition(
                currentPosition.substring(1).toInt(),
                Columns.valueOf(currentPosition[0].toString()).column
            )
        }

        fun cellName(move: CellPosition): String {
            return "${Columns.getColumnFromNum(move.column)}${move.row}"
        }
    }
}