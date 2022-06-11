//2. Escreva um programa que tem duas constantes que representam dois números e o programa mostrar o maior deles.
fun main() {
    println("\nPROGRAMA QUE MOSTRA O MAIOR DE DOIS NÚMEROS\n")

    print("Digite o primeiro número: ")
    val n1 = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val n2 = readLine()!!.toDouble()

    println("\nNúmeros escolhidos: $n1 e $n2")

    if (n1 > n2)
        println("\nO maior número é $n1.")
    else if (n2 > n1)
        println("\nO maior número é $n2.")
}
