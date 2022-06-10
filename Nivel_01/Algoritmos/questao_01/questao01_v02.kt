//1. Faça um programa que soma quatro número inteiros e exibe o resultado da soma no console.
fun main(){
  println("\nPROGRAMA QUE SOMA 4 NÚMEROS\n")
  print("Digite o primeiro número: ")
  val n1 = readLine()!!.toInt()
  
  print("Digite o segundo número: ")
  val n2 = readLine()!!.toInt()
  
  print("Digite o terceiro número: ")
  val n3 = readLine()!!.toInt()
  
  print("Digite o quarto número: ")
  val n4 = readLine()!!.toInt()

  val resposta = n1 + n2 + n3 + n4

  println("\nA soma de $n1, $n2, $n3 e $n4 é igual a $resposta.")
}
