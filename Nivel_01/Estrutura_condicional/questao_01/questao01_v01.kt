fun main() {
    println("\nPROGRAMA QUE CALCULA A MÉDIA PONDERADA DAS NOTAS DE UM ALUNO\n")

    val PESO_TRABALHO_DE_LABORATORIO = 2
    val PESO_AVALIACAO_SEMESTRAL = 3
    val PESO_EXAME_FINAL = 5

    val notaTrabalhoDeLaboratorio = 10.0
    val notaAvaliacaoSemestral = 6.5
    val notaExameFinal = 8.0

    val media = (notaTrabalhoDeLaboratorio*PESO_TRABALHO_DE_LABORATORIO + notaAvaliacaoSemestral*PESO_AVALIACAO_SEMESTRAL + notaExameFinal*PESO_EXAME_FINAL)/10

    print("Sua média é $media e ")

    if(media >= 8 && media <= 10)
        println("seu conceito é A.")
    else if(media >= 7 && media < 8)
        println("seu conceito é B.")
    else if(media >= 6 && media < 7)
        println("seu conceito é C.")
    else if(media >= 5 && media < 6)
        println("seu conceito é D.")
    else if(media >= 0 && media < 5)
        println("seu conceito é E.")
}

