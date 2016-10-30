package main

/**
 * Created by Roger on 30/10/2016.
 */
fun main(args: Array<String>) {

    var num1: Int = 0
    var num2: Int = 0

    try {
        println("Introduzca valor 1: ")
        num1 = Utis().getLineInInt(readLine())
        println("Introduzca valor 2: ")
        num2 = Utis().getLineInInt(readLine())
    } catch(e: NumberFormatException) {
        println("Introduzca un valor o valores correctos")
    }
    if (num1 == num2) println("Los numeros tienen que ser distintos")
    if (num1 > num2) println("El numero $num1 es el mayor") else println("El numero $num2 es el mayor")

}