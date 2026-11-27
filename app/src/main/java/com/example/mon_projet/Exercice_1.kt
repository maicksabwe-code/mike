package com.example.mon_projet
fun addition(nombre1: Int, nombre2: Int) = nombre1 + nombre2
fun soustraction(nombre1: Int, nombre2: Int) = nombre1 - nombre2
fun multiplication(nombre1: Int, nombre2: Int) = nombre1 * nombre2

fun division(nombre1: Int, nombre2: Int) = try {
    nombre1 / nombre2
} catch (e: ArithmeticException) {
    println("Erreur division par 0")
    0
}

fun calculatrice(nombre1: Int, nombre2: Int, operation: String) {
    val resultat = when (operation) {
        "+" -> addition(nombre1, nombre2)
        "-" -> soustraction(nombre1, nombre2)
        "*" -> multiplication(nombre1, nombre2)
        "/" -> division(nombre1, nombre2)
        else -> return println("Opération inconnue")
    }
    println("Résultat : $resultat")
}

fun main() {
    calculatrice(6, 3, "+") // Résultat : 9
    calculatrice(6, 3, "*") // Résultat : 18
    calculatrice(6, 0, "/") // Erreur division par 0, puis Résultat : 0
}