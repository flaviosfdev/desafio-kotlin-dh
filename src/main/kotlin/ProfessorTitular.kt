class ProfessorTitular(
    nome: String,
    sobrenome: String,
    codigoProfessor: Int,
    var especialidade: String
) : Professor(nome, sobrenome, codigoProfessor) {

    override fun toString(): String = """
        ===== Informações Professor Titular =====
        Nome: $nome $sobrenome
        Código: $codigoProfessor
        Especialidade: $especialidade
    """.trimIndent()

}