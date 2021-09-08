class ProfessorTitular(
    nome: String,
    sobrenome: String,
    codigoProfessor: Int,
    var especialidade: String
) : Professor(nome, sobrenome, codigoProfessor)