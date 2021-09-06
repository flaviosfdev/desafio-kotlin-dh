class ProfessorAdjunto(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codigoProfessor: Int,
    val quantidadeHorasMonitoria: Int
) : Professor(
    nome, sobrenome, tempoDeCasa, codigoProfessor
)