/*7. Faça um programa tem o número de horas trabalhadas e o valor do salário mínimo, calcule e mostre o salário a receber, seguindo as etapas:
    1. a hora trabalhada vale a metade do salário mínimo;
    2. o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada.
    3. o imposto equivale a 3% do salário bruto.
    4. o salário a receber equivale ao salário bruto menos o imposto*/

fun main() {
    println("\nPROGRAMA QUE CALCULA SALÁRIO QUE UM FUNCIONÁRIO IRÁ RECEBER\n")

    val salarioMinimo = 1212.00
    val valorHoraTrabalhada = salarioMinimo/2
    val numeroDeHorasTrabalhadas = 120
    val salarioBruto = valorHoraTrabalhada*numeroDeHorasTrabalhadas
    val imposto = salarioBruto*0.3
    val salarioAReceber = salarioBruto - imposto

    println("Salário a receber: $salarioAReceber")
}
