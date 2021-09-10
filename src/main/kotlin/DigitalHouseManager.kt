class DigitalHouseManager {

    val alunos: MutableList<Aluno> = mutableListOf()
    val professores: MutableList<Professor> = mutableListOf()
    val cursos: MutableList<Curso> = mutableListOf()
    val matriculas: MutableList<Matricula> = mutableListOf()


    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {

        when (val cursoExistente: Curso? = cursos.find { it.codigoCurso == codigoCurso }) {
            null -> {
                val novoCurso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
                cursos.add(novoCurso)
                println("Curso ${novoCurso.nome} cadastrado com sucesso! (cód. ${novoCurso.codigoCurso})")
            }
            else -> {
                println("Não foi possível cadastrar o curso: $nome - cód: $codigoCurso.")
                println("Cód. ${cursoExistente.codigoCurso} já pertence ao curso: ${cursoExistente.nome}.")
            }
        }

    }


    fun excluirCurso(codigoCurso: Int) {

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


    fun imprimirCursosCadastrados(): String {

        return if (cursos.isEmpty()) {
            "Ainda não há cursos cadastrados."
        } else {
            var result = "===== Cursos Cadastrados =====\n"
            cursos.forEach { result += "Curso: ${it.nome} (Cód. ${it.codigoCurso})\n" }
            result
        }

    }


    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {

        when (val professorExistente: Professor? = professores.find { it.codigoProfessor == codigoProfessor }) {
            null -> {
                val novoProfessorAdjunto = ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras)
                professores.add(novoProfessorAdjunto)
                println("Professor(a) Adjunto(a) ${novoProfessorAdjunto.nome} ${novoProfessorAdjunto.sobrenome} cadastrado(a) com sucesso! (cód. ${novoProfessorAdjunto.codigoProfessor})")
            }
            else -> {
                println("Não foi possível cadastrar $nome $sobrenome como um(a) novo(a) Professor(a) Adjunto(a).")
                println("Cód. $codigoProfessor já pertence ao(à) Professor(a) ${professorExistente.nome} ${professorExistente.sobrenome}")
            }
        }

    }


    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {

        when (val professorExistente : Professor? = professores.find { it.codigoProfessor == codigoProfessor }) {
            null -> {
                val novoProfessorTitular = ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade)
                professores.add(novoProfessorTitular)
                println("Professor(a) Titular ${novoProfessorTitular.nome} ${novoProfessorTitular.sobrenome} cadastrado(a) com sucesso! (cód. ${novoProfessorTitular.codigoProfessor})")
            }
            else -> {
                println("Não foi possível cadastrar $nome $sobrenome como um(a) novo(a) Professor(a) Titular .")
                println("Cód. $codigoProfessor já pertence ao(à) Professor(a) ${professorExistente.nome} ${professorExistente.sobrenome}")
            }
        }

    }


    fun excluirProfessor(codigoProfessor: Int) {

        when (val professor: Professor? = professores.find { it.codigoProfessor == codigoProfessor }) {
            null -> {
                println("Erro: Código (cód. $codigoProfessor) inválido.")
            }
            else -> {
                val professorExcluido = professor
                professores.remove(professor)
                println("Professor(a) ${professorExcluido.nome} removido(a) com sucesso.")
            }
        }

    }


    fun imprimirListaDeProfessores(): String {

        return if (professores.isEmpty()) {
            "Ainda não há professores cadastrados."
        } else {
            var result = "===== Professores Cadastrados =====\n"
            professores.forEach {
                result += if (it is ProfessorAdjunto) {
                    "${it.nome} ${it.sobrenome} - Adjunto (Cód. ${it.codigoProfessor})\n"
                } else {
                    "${it.nome} ${it.sobrenome} -Titular (Cód. ${it.codigoProfessor})\n"
                }
            }
            result
        }

    }


    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {

        when (val alunoExistente: Aluno? = alunos.find { it.codigoAluno == codigoAluno }) {
            null -> {
                val novoAluno = Aluno(nome, sobrenome, codigoAluno)
                alunos.add(novoAluno)
                println("Aluno(a) ${novoAluno.nome} ${novoAluno.sobrenome} matriculado(a) com sucesso! (cód. ${novoAluno.codigoAluno})")
            }
            else -> {
                println("Não foi possível matricular $nome $sobrenome como um(a) novo(a) aluno(a).")
                println("Cód. $codigoAluno já pertence ao(à) aluno(a) ${alunoExistente.nome} ${alunoExistente.sobrenome}.")
            }
        }

    }


    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        TODO("matricular aluno em um curso")
    }


    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        TODO("alocar professores em um curso")
    }

}