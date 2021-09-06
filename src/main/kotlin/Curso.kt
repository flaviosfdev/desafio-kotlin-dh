class Curso(
    val nome: String,
    val codigoCurso: Int,
    val professorTitular: ProfessorTitular,
    val professorAdjunto: ProfessorAdjunto,
    val quantidadeMaximaAlunos: Int,
    val alunosMatriculados: List<Aluno>
) {

    override fun equals(other: Any?): Boolean = (other is Curso && this.codigoCurso == other.codigoCurso)

}