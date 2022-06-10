/*6. Faça um programa que tem o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
    1. a idade dessa pessoa;
    2. quantos anos ela terá em 2050;*/

fun main() {
    println("\nPROGRAMA QUE DESCOBRE A IDADE DE UMA PESSOA BASEADO EM SEU ANO DE NASCIMENTO E CALCULA A IDADE QUE ELA TERÁ EM 2050\n")

    val anoNascimento = 2001
    val anoAtual = 2022

    val idade = anoAtual - anoNascimento
    val idadeEm2050 = 2050 - anoNascimento

    println("Idade atual: $idade\nIdade em 2050: $idadeEm2050")
}
