class DigitalHouseManager {

    val alunos: MutableList<Aluno> = mutableListOf()
    val professores: MutableList<Professor> = mutableListOf()
    val cursos: MutableList<Curso> = mutableListOf()
    val matriculas: MutableList<Matricula> = mutableListOf()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {

        val cursoExistente: Curso? = cursos.find { it.codigoCurso == codigoCurso }

        when (cursoExistente) {
            null -> {
                val novoCurso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
                cursos.add(novoCurso)
                println("Curso ${novoCurso.nome} (cód. ${novoCurso.codigoCurso}) cadastrado com sucesso!")
            }
            else -> {
                println("Não foi possível cadastrar o curso: $nome - cód: $codigoCurso.")
                println("Cód. ${cursoExistente.codigoCurso} já pertence ao curso: ${cursoExistente.nome}.")
            }
        }
    }

    fun excluirCurso(codigoCurso: Int) {

        val curso : Curso?  = cursos.find { it.codigoCurso == codigoCurso }

        when (curso) {
            null -> {
                println("Curso inexistente.")
            }
            else -> {
                cursos.remove(curso)
                println("Curso ${curso.nome} removido com sucesso.")
            }
        }

    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        TODO("registrar Professor Adjunto")
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        TODO("registrar Professor Titular")
    }

    fun excluirProfessor(codigoProfessor: Int) {
        TODO("excluir Professor")
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        TODO("matricular aluno")
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        TODO("matricular aluno em um curso")
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        TODO("alocar professores em um curso")
    }


}