//2. Escreva um programa que tem duas constantes que representam dois números e o programa mostrar o maior deles.
fun main() {
    println("\nPROGRAMA QUE MOSTRA O MAIOR DE DOIS NÚMEROS\n")

    val n1 = 5
    val n2 = 2

    println("Números escolhidos: $n1 e $n2")

    if (n1 > n2)
        println("O maior número é $n1.")
    else if (n2 > n1)
        println("O maior número é $n2.")
}
