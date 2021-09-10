class Curso(
    var nome: String,
    val codigoCurso: Int,
    private var quantidadeMaximaDeAlunos: Int,
) {

    lateinit var professorTitular: ProfessorTitular
        private set
    lateinit var professorAdjunto: ProfessorAdjunto
        private set
    private val alunosMatriculados: MutableList<Aluno> = mutableListOf()


    init {
        if (quantidadeMaximaDeAlunos <= 0) {
            quantidadeMaximaDeAlunos = 5
        }
    }


    override fun equals(other: Any?): Boolean = (other is Curso && this.codigoCurso == other.codigoCurso)


    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (alunosMatriculados.size < quantidadeMaximaDeAlunos) {
            alunosMatriculados.add(umAluno)
            return true
        } else {
            return false
        }
    }


    fun excluirAluno(umAluno: Aluno) {
        if (alunosMatriculados.contains(umAluno)) {
            alunosMatriculados.remove(umAluno)
        } else {
            println("Não foi possível realizar operação.")
            println("${umAluno.nome} ${umAluno.sobrenome} não está matriculado no curso ${this.nome}")
        }
    }


    fun alocarProfessorTitular(novoProfessorTitular: ProfessorTitular) {
        professorTitular = novoProfessorTitular
        println("Professor(a) Titular ${novoProfessorTitular.nome} ${novoProfessorTitular.sobrenome} (cód. ${novoProfessorTitular.codigoProfessor}) especialista em ${novoProfessorTitular.especialidade} alocado(a) com sucesso no curso $nome (cód. $codigoCurso).")
    }


    fun alocarProfessorAdjunto(novoProfessorAdjunto: ProfessorAdjunto) {
        professorAdjunto = novoProfessorAdjunto
        println("Professor(a) Ajunto(a) ${novoProfessorAdjunto.nome} ${novoProfessorAdjunto.sobrenome} (cód. ${novoProfessorAdjunto.codigoProfessor}) com sucesso no curso $nome (cód. $codigoCurso). CH Monitoria: ${novoProfessorAdjunto.quantidadeHorasMonitoria}H/semana.")
    }


    fun quantidadeDeAlunosMatriculados(): Int = alunosMatriculados.size


    fun alterarQuantidadeMaximaDeAlunos(novaQuantidade: Int) {
        quantidadeMaximaDeAlunos = novaQuantidade
    }


    override fun toString(): String = """
            ===== Informações Curso =====
            Curso: $nome
            Código: $codigoCurso
            Aluno matriculados: ${alunosMatriculados.size}
            Capacidade: $quantidadeMaximaDeAlunos alunos
        """.trimIndent()

}