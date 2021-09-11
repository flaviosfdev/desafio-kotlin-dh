class Aluno(
    var nome: String,
    var sobrenome: String,
    val codigoAluno: Int
) {

    override fun equals(other: Any?): Boolean =
        (other is Aluno && this.codigoAluno == other.codigoAluno)


    override fun toString(): String = """
        ===== Informações Aluno =====
        Nome: $nome $sobrenome
        Código: $codigoAluno
    """.trimIndent()

}