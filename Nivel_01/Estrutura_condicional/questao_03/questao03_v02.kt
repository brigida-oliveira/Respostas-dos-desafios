//3. Faça um programa que tem três constantes que representam números, o programa deve mostrar os números em ordem crescente. **Dica: Use Arrays.**
fun main() {
    println("\nPROGRAMA QUE ORDENA 3 NÚMEROS\n")

    print("Digite o primeiro número: ")
    val n1 = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val n2 = readLine()!!.toInt()

    print("Digite o terceiro número: ")
    val n3 = readLine()!!.toInt()

    println("\nNúmeros escolhidos: $n1, $n2, $n3")

    val numeros = arrayOf(0, 0, 0)

    if (n1 < n2 && n1 < n3 && n2 < n3){
        numeros[0] = n1
        numeros[1] = n2
        numeros[2] = n3
    } else if (n1 < n2 && n1 < n3 && n3 < n2){
        numeros[0] = n1
        numeros[1] = n3
        numeros[2] = n2
    } else if (n2 < n1 && n2 < n3 && n1 < n3){
        numeros[0] = n2
        numeros[1] = n1
        numeros[2] = n3
    } else if (n2 < n1 && n2 < n3 && n3 < n1){
        numeros[0] = n2
        numeros[1] = n3
        numeros[2] = n1
    } else if (n3 < n1 && n3 < n2 && n1 < n2){
        numeros[0] = n3
        numeros[1] = n1
        numeros[2] = n2
    } else if (n3 < n1 && n3 < n2 && n2 < n1){
        numeros[0] = n3
        numeros[1] = n2
        numeros[2] = n1
    }

println("Números ordenados: ${numeros[0]}, ${numeros[1]}, ${numeros[2]}")
}
