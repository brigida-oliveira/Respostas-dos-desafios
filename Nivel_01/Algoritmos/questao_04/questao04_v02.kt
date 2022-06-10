//Faça um programa que calcula a área de um triângulo. Sabe-se que: Área = (base * altura) / 2

fun main() {
    println("\nPROGRAMA QUE CALCULA A ÁREA DE UM TRIÂNGULO\n")

    print("Digite o valor da base do triângulo: ")
    val base = readLine()!!.toDouble()

    print("Digite o valor da altura do triângulo: ")
    val altura = readLine()!!.toDouble()

    val area = (base*altura)/2

    println("A área de um triângulo de base $base e altura $altura é $area.")
}
