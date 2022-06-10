//Faça um programa que calcule a média de três notas e exibe o resultado no console.

fun main() {
    println("\nPROGRAMA QUE CALCULA A MÉDIA DE 3 NOTAS")
    
    print("Digite a primeira nota: ")
    val n1 = readLine()!!.toDouble()

    print("Digite a segunda nota: ")
    val n2 = readLine()!!.toDouble()

    print("Digite a terceira nota: ")
    val n3 = readLine()!!.toDouble()

    val media = n1 + n2 + n3

    println("A média das três notas é: $media.")
}
