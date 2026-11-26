package com.example.mon_projet

import org.junit.Test

class Exercice1 {
    @Test
    fun main() {
        val promotions = mutableMapOf(
            "L1Info" to 350,
            "L2Info" to 200,
            "L3Info" to 100
        )

        promotions["M1Info"] = 50
        promotions["M2Info"] = 35

        val listeCles = promotions.keys.toList()
        val listeValeurs = promotions.values.toList()

        println("Clés : $listeCles")
        println("Valeurs : $listeValeurs")
        println("Nombre d'items : ${promotions.size}")
        println("Nombre de clés : ${listeCles.size}")
        println("Nombre de valeurs : ${listeValeurs.size}")
    }
}
