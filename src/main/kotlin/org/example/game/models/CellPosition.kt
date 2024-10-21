package org.example.game.org.example.game.models

import org.example.game.models.Columns

data class CellPosition(
    val column: Int,
    val row: Int
) {
    companion object {
        fun from(currentPosition: String): CellPosition {
            return CellPosition(
                Columns.valueOf(currentPosition[0].toString()).column,
                currentPosition.substring(1).toInt()
            )
        }

        fun cellName(move: CellPosition): String {
            return "${Columns.getColumnFromNum(move.column)}${move.row}"
        }
    }
}