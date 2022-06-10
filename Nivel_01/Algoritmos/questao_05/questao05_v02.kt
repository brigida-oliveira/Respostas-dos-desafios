/*5. Faça um programa que calcula:
    1. o número ao quadrado;
    2. o número ao cubo;
    3. a raiz quadrada;
    4. a raiz cúbica;*/

import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    println("\nPROGRAMA QUE ELEVA UM NÚMERO AO QUADRADO E DEPOIS AO CUBO E LOGO EM SEGUIDA FAZ A RAIZ QUADRADA E A RAIZ CÚBICA DESSE NÚMERO\n")

    print("Digite um número: ")
    val numero = readLine()!!.toDouble()

    val quadrado = numero*numero
    val cubo = numero*numero*numero
    val raizQuadrada = sqrt(numero)
    val raizCubica = numero.pow(1.0 / 3.0) 

    println("""
    Número $numero elevado ao quadrado: $quadrado
    Número $numero elevado ao cubo: $cubo
    Raiz quadrada de $numero: $raizQuadrada
    Raiz cúbica de $numero: $raizCubica
    """)
}
