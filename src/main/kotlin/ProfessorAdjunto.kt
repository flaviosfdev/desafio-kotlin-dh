class ProfessorAdjunto(
    nome: String,
    sobrenome: String,
    codigoProfessor: Int,
    var quantidadeHorasMonitoria: Int
) : Professor(nome, sobrenome, codigoProfessor) {


    override fun toString(): String = """
        ===== Informações Professor Adjunto =====
        Nome: $nome $sobrenome
        Código: $codigoProfessor
        CH Monitoria: $quantidadeHorasMonitoria Horas/Semana
    """.trimIndent()

}