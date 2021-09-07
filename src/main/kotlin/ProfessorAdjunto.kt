class ProfessorAdjunto(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codigoProfessor: Int,
    var quantidadeHorasMonitoria: Int
) : Professor(
    nome, sobrenome, tempoDeCasa, codigoProfessor
)