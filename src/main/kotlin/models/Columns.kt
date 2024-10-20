package org.example.game.models

enum class Columns(val column: Int) {
    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6),
    G(7),
    H(8);

    companion object {
        fun getColumnFromNum(number: Int): String {
            return entries.find { it.column == number }!!.name
        }
    }
}