//4. Faça um programa que recebe um número inteiro e verifica se o número é ímpar ou par.
fun main() {
    println("\nPROGRAMA QUE VERIFICA SE UM NÚMERO É PAR OU ÍMPAR\n")

    val numero = 4

    if (numero % 2 == 0)
        println("O número $numero é par.")
    else
        println("O número $numero é ímpar.")
}
