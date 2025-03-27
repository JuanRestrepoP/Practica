package com.example.myapplication

fun main() {
    println("Hola Kotlin")


    print("Por favor ingresa un texto: ")
    var myString = readLine() ?: "Valor por defecto"  // Si el usuario no ingresa nada, asignamos un valor por defecto
    println("El texto que ingresaste es: $myString")

    print("Por favor ingresa un número entero: ")
    val myInt = readLine()?.toIntOrNull() ?: 0  // Si no ingresa un número válido, se asigna 0
    println("El número que ingresaste es: $myInt")

    print("Por favor ingresa un número decimal: ")
    val myDouble = readLine()?.toDoubleOrNull() ?: 0.0  // Si no ingresa un número decimal válido, se asigna 0.0
    println("El número decimal que ingresaste es: $myDouble")

    val myConst = "Valor constante"
    println("Constante: $myConst")


    println("\nLlamando a la función de cambio de texto:")
    val nuevoValor = cambiarTexto("Este es un nuevo texto")
    println(nuevoValor)

    println("\nVerificación de número:")
    verificarNumero(myInt)


    println("\nMostrando los elementos de la lista:")
}


fun cambiarTexto(texto: String): String {
    return "Texto modificado: $texto"
}


fun verificarNumero(num: Int) {
    if (num > 0) {
        println("El número $num es positivo.")
    } else if (num < 0) {
        println("El número $num es negativo.")
    } else {
        println("El número es cero.")
    }
}
