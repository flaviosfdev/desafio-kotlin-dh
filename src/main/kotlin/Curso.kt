class Curso(
    var nome: String,
    val codigoCurso: Int,
    var quantidadeMaximaAlunos: Int,

    ) {

    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto
    val alunosMatriculados: MutableList<Aluno> = mutableListOf()


    init {
        if (quantidadeMaximaAlunos <= 0) {
            quantidadeMaximaAlunos = 5
        }
    }


    override fun equals(other: Any?): Boolean = (other is Curso && this.codigoCurso == other.codigoCurso)


    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (alunosMatriculados.size < quantidadeMaximaAlunos) {
            alunosMatriculados.add(umAluno)
            return true
        } else {
            return false
        }
    }


    fun excluirAluno(umAluno: Aluno): Unit {
        if (alunosMatriculados.contains(umAluno)) {
            alunosMatriculados.remove(umAluno)
        } else {
            println("Não foi possível realizar operação.")
            println("${umAluno.nome} ${umAluno.sobrenome} não está matriculado no curso ${this.nome}")
        }
    }
}