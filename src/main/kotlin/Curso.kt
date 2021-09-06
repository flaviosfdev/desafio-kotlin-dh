class Curso(
    val nome: String,
    val codigoCurso: Int,
    val professorTitular: ProfessorTitular,
    val professorAdjunto: ProfessorAdjunto,
    var quantidadeMaximaAlunos: Int,
    val alunosMatriculados: MutableList<Aluno>
) {

    init {
        if (quantidadeMaximaAlunos <= 0) {
            quantidadeMaximaAlunos = 10
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

    fun excluirAluno(umAluno: Aluno): Unit{
        if (alunosMatriculados.contains(umAluno)) {
            alunosMatriculados.remove(umAluno)
        } else {
            println("Não foi possível realizar operação.")
            println("${umAluno.nome} ${umAluno.sobrenome} não está matriculado no curso ${this.nome}")
        }
    }
}