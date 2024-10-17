package org.example.game.models

enum class Columns(val column: Int) {
    A(0),
    B(1),
    C(2),
    D(3),
    E(4),
    F(5),
    G(6),
    H(7);

    companion object {
        fun getColumnFromNum(number: Int): String {
            return entries.find { it.column == number }!!.name
        }
    }
}