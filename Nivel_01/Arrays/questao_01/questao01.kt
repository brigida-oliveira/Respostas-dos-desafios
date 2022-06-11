/*1. Faça um programa que tem um array de inteiros, calcule e mostre:
    a. a soma dos números;
    b. a quantidade de números;
    c. a média dos números;
    d. o maior número;
    e. o menor número;
    f. a média dos números pares;
    g. a porcentagem dos números ímpares entre todos os números digitados.*/

fun main() {
    println("\nPROGRAMA QUE CALCULA A SOMA, A QUANTIDADE, A MÉDIA, O MAIOR NÚMERO, O MENOR NÚMERO, A MÉDIA DOS NÚMEROS PARES E A PORCENTAGEM DE NÚMEROS ÍMPARES DE UM ARRAY\n")

    val numeros = arrayOf(5.0, 6.0, 2.0, 4.0, 7.0, 1.0, 8.0, 3.0)

    print("Array escolhido: ")

    var soma = 0.0
    var maior = 0.0
    var menor = 100.0
    var somaNumerosPares = 0.0
    var contNumerosPares = 0
    var contNumerosImpares = 0
    val quantidadeDeNumeros = numeros.size

    for(n in numeros) {
        print(n)
        print(" ")

        soma = soma + n

        if (n > maior) {
            maior = n
        } else if (n < menor) {
            menor = n
        }

        if (n % 2 == 0.0) {
            somaNumerosPares = somaNumerosPares + n
            contNumerosPares = contNumerosPares + 1
        } else if (n % 2 != 0.0){
            contNumerosImpares = contNumerosImpares + 1
        }
    }

    val mediaNumerosPares = somaNumerosPares/contNumerosPares
    val porcentagemNumerosImpares = contNumerosImpares.toDouble()/quantidadeDeNumeros*100

    println("\n\nSoma de números do array: $soma")
    println("Quantidade de números do array: $quantidadeDeNumeros")
    println("Média dos números do array: ${soma/quantidadeDeNumeros}")
    println("Maior número do array: $maior")
    println("Menor número do array: $menor")
    println("Média dos números pares do array: $mediaNumerosPares")
    println("Porcentagem dos números ímpares do array: $porcentagemNumerosImpares %")
}
