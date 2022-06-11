//3. Faça um programa que tem três constantes que representam números, o programa deve mostrar os números em ordem crescente. **Dica: Use Arrays.**
fun main() {
    println("\nPROGRAMA QUE ORDENA 3 NÚMEROS\n")

    val numeros = arrayOf(0.0, 0.0, 0.0)

    print("Digite o primeiro número: ")
    numeros[0] = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    numeros[1] = readLine()!!.toDouble()

    print("Digite o terceiro número: ")
    numeros[2] = readLine()!!.toDouble()

    println("\nNúmeros escolhidos: ${numeros[0]}, ${numeros[1]}, ${numeros[2]}")

    
for(posicaoAtual in 0 until (numeros.size -1)) {
    if( numeros[posicaoAtual] > numeros[posicaoAtual+1]) {
        val temp = numeros[posicaoAtual]
        numeros[posicaoAtual] = numeros[posicaoAtual+1]
        numeros[posicaoAtual+1] = temp
    }
}

println("Números ordenados: ${numeros[0]}, ${numeros[1]}, ${numeros[2]}")
}
