//Faça um programa que calcula e mostra o salário de um funcionário que teve um aumento de 25%.

fun main() {
    println("\nPROGRAMA QUE CALCULA O SALÁRIO DE UM FUNCIONÁRIO QUE TEVE AUMENTO DE 25%\n")
    val salarioAntigo = 1593.45
    println("Salário sem aumento: $salarioAntigo")
    val aumento = salarioAntigo*25/100
    val salarioAtual = salarioAntigo + aumento
    println("Salário sem aumento: $salarioAtual")
}
