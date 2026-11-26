package com.example.mon_projet

import org.junit.Test

class Exercice2 {
    @Test
    fun main() {
        val n = 5
        var factoriel = 1

        for (i in 1..n) {
            factoriel *= i
        }

        println("Le factoriel de $n ($n!) est : $factoriel")
    }
}
