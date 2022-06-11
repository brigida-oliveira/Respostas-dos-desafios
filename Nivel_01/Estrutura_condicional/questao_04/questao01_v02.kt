//4. Faça um programa que recebe um número inteiro e verifica se o número é ímpar ou par.
fun main() {
    println("\nPROGRAMA QUE VERIFICA SE UM NÚMERO É PAR OU ÍMPAR\n")

    print("Digite um número: ")
    val numero = readLine()!!.toInt()

    if (numero % 2 == 0)
        println("\nO número $numero é par.")
    else
        println("\nO número $numero é ímpar.")
}
