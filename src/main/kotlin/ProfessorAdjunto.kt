class ProfessorAdjunto(
    nome: String,
    sobrenome: String,
    codigoProfessor: Int,
    var quantidadeHorasMonitoria: Int
) : Professor(nome, sobrenome, codigoProfessor)