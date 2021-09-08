class DigitalHouseManager {

    val alunos: MutableList<Aluno> = mutableListOf()
    val professores: MutableList<Professor> = mutableListOf()
    val cursos: MutableList<Curso> = mutableListOf()
    val matriculas: MutableList<Matricula> = mutableListOf()


    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) : Unit {

        when (val cursoExistente: Curso? = cursos.find { it.codigoCurso == codigoCurso }) {
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


    fun excluirCurso(codigoCurso: Int) : Unit{

        when (val curso: Curso? = cursos.find { it.codigoCurso == codigoCurso }) {
            null -> {
                println("Curso (cód. $codigoCurso) inexistente.")
            }
            else -> {
                val cursoExcluido = curso
                cursos.remove(curso)
                println("Curso ${curso.nome} removido com sucesso.")
            }
        }

    }


    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) : Unit {

        when (val professorExistente: Professor? = professores.find { it.codigoProfessor == codigoProfessor }) {
            null -> {
                val novoProfessorAdjunto = ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras)
                professores.add(novoProfessorAdjunto)
                println("Professor Adjunto ${novoProfessorAdjunto.nome} ${novoProfessorAdjunto.sobrenome} cadastrado com sucesso!")
            }
            else -> {
                println("Não foi possível cadastrar o Professor Adjunto $nome $sobrenome.")
                println("Cód. $codigoProfessor já pertence ao Professor ${professorExistente.nome} ${professorExistente.sobrenome}")
            }
        }

    }


    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {

        when (val professorExistente : Professor? = professores.find { it.codigoProfessor == codigoProfessor }) {
            null -> {
                val novoProfessorTitular = ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade)
                professores.add(novoProfessorTitular)
                println("Professor Titular ${novoProfessorTitular.nome} ${novoProfessorTitular.sobrenome} cadastrado com sucesso!")
            }
            else -> {
                println("Não foi possível cadastrar o Professor Titular $nome $sobrenome.")
                println("Cód. $codigoProfessor já pertence ao Professor ${professorExistente.nome} ${professorExistente.sobrenome}")
            }
        }

    }


    fun excluirProfessor(codigoProfessor: Int) : Unit {

        when (val professor: Professor? = professores.find { it.codigoProfessor == codigoProfessor }) {
            null -> {
                println("Não foi possível excluir professor. Erro: Código Professor $codigoProfessor inexistente.")
            }
            else -> {
                val professorExcluido = professor
                professores.remove(professor)
                println("Professor ${professorExcluido.nome} removido com sucesso.")
            }
        }

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