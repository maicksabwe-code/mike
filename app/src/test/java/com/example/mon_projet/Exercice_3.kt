package com.example.mon_projet

import org.junit.Test

class Exercice3 {
    @Test
    fun main() {
        val phrase = "Je suis etudiant en M1 Info a l'Universite de Mbujimayi"
        val voyelles = mutableListOf<Char>()
        val consonnes = mutableListOf<Char>()

        for (c in phrase.lowercase()) {
            if (c in "aeiouy") {
                voyelles.add(c)
            } else if (c.isLetter()) {
                consonnes.add(c)
            }
        }

        println("Voyelles (${voyelles.size}) : $voyelles")
        println("Consonnes (${consonnes.size}) : $consonnes")
    }
}
