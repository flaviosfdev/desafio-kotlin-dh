class DigitalHouseManager {

    private val alunos: MutableList<Aluno> = mutableListOf()
    private val professores: MutableList<Professor> = mutableListOf()
    private val cursos: MutableList<Curso> = mutableListOf()
    private val matriculas: MutableList<Matricula> = mutableListOf()


    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {

        when (val cursoExistente: Curso? = cursos.find { it.codigoCurso == codigoCurso }) {
            null -> {
                if (codigoCurso <= 0) {
                    println("Não foi possível cadastrar Curso $nome. Código inválido (cód. $codigoCurso).")
                } else {
                    val novoCurso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
                    cursos.add(novoCurso)
                    println("Curso ${novoCurso.nome} cadastrado com sucesso! (cód. ${novoCurso.codigoCurso})")
                }
            }
            else -> {
                println("Não foi possível cadastrar o curso: $nome - cód: $codigoCurso. Cód. ${cursoExistente.codigoCurso} já pertence ao curso: ${cursoExistente.nome}.")
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


    fun alterarQuantidadeMaximaDeAlunosEmCurso(codigoCurso: Int, novaQuantidade: Int) {

        when (val curso: Curso? = cursos.find { it.codigoCurso == codigoCurso }) {
            null -> {
                println("Curso (cód. $codigoCurso) inválido.")
            }
            else -> {
                if (novaQuantidade < 0) {
                    println("Quantidade menor que 0 inválida.")
                } else if (novaQuantidade < curso.quantidadeDeAlunosMatriculados()) {
                    println("Não foi possível alterar quantidade. Quantidade menor que número de alunos matriculados. Quantidade informada: $novaQuantidade.Quantidade de alunos matriculados: ${curso.quantidadeDeAlunosMatriculados()}.")
                } else {
                    curso.alterarQuantidadeMaximaDeAlunos(novaQuantidade)
                    println("Quantidade máxima de alunos do curso ${curso.nome} alterada com sucesso. Nova quantidade: $novaQuantidade")
                }
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
                if (codigoProfessor <= 0) {
                    println("Não foi possível cadastrar Professor(a) Adjunto(a) $nome $sobrenome. Código inválido (cód. $codigoProfessor)")
                } else {
                    val novoProfessorAdjunto = ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras)
                    professores.add(novoProfessorAdjunto)
                    println("Professor(a) Adjunto(a) ${novoProfessorAdjunto.nome} ${novoProfessorAdjunto.sobrenome} cadastrado(a) com sucesso! (cód. ${novoProfessorAdjunto.codigoProfessor})")
                }
            }
            else -> {
                println("Não foi possível cadastrar $nome $sobrenome como um(a) novo(a) Professor(a) Adjunto(a). Cód. $codigoProfessor já pertence ao(à) Professor(a) ${professorExistente.nome} ${professorExistente.sobrenome}")
            }
        }

    }


    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {

        when (val professorExistente: Professor? = professores.find { it.codigoProfessor == codigoProfessor }) {
            null -> {
                if (codigoProfessor <= 0) {
                    println("Não foi possível cadastrar Professor(a) Titular $nome $sobrenome. Código inválido (cód. $codigoProfessor)")
                } else {
                    val novoProfessorTitular = ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade)
                    professores.add(novoProfessorTitular)
                    println("Professor(a) Titular ${novoProfessorTitular.nome} ${novoProfessorTitular.sobrenome} cadastrado(a) com sucesso! (cód. ${novoProfessorTitular.codigoProfessor})")
                }
            }
            else -> {
                println("Não foi possível cadastrar $nome $sobrenome como um(a) novo(a) Professor(a) Titular. Cód. $codigoProfessor já pertence ao(à) Professor(a) ${professorExistente.nome} ${professorExistente.sobrenome}")
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


    /**
     * Matricular aluno na escola
     */
    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {

        when (val alunoExistente: Aluno? = alunos.find { it.codigoAluno == codigoAluno }) {
            null -> {
                val novoAluno = Aluno(nome, sobrenome, codigoAluno)
                alunos.add(novoAluno)
                println("Aluno(a) ${novoAluno.nome} ${novoAluno.sobrenome} matriculado(a) com sucesso! (cód. ${novoAluno.codigoAluno})")
            }
            else -> {
                println("Não foi possível matricular $nome $sobrenome como um(a) novo(a) aluno(a). Cód. $codigoAluno já pertence ao(à) aluno(a) ${alunoExistente.nome} ${alunoExistente.sobrenome}.")
            }
        }

    }


    /**
     * Matricular aluno em um curso
     */
    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {

        val aluno: Aluno? = alunos.find { it.codigoAluno == codigoAluno }
        val curso: Curso? = cursos.find { it.codigoCurso == codigoCurso }

        when {
            aluno == null && curso == null -> println("Aluno (cód. $codigoAluno) e Curso (cód. $codigoCurso) inválidos!")
            aluno == null -> println("Não foi possível realizar matricula. Aluno (cód. $codigoAluno) inválido!")
            curso == null -> println("Não foi possível realizar matricula. Curso (cód. $codigoCurso) inválido!")
            else -> {
                if (curso.adicionarUmAluno(aluno)) {
                    val matricula = Matricula(aluno, curso)
                    matriculas.add(matricula)
                    println("Aluno ${aluno.nome} ${aluno.sobrenome} (cód. ${aluno.codigoAluno}) matriculado(a) com sucesso no curso ${curso.nome} (cód. ${curso.codigoCurso}) - Matrícula: ${matricula.toString()}")
                } else {
                    println("Não há vagas no curso ${curso.nome} (cód. ${curso.codigoCurso}) para matricular o(a) aluno(a) ${aluno.nome} ${aluno.sobrenome} (cód. ${aluno.codigoAluno}).")
                }
            }
        }

    }


    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

        try {
            val curso: Curso? = cursos.find { it.codigoCurso == codigoCurso }
            val professorTitular: ProfessorTitular? = professores.find { it.codigoProfessor == codigoProfessorTitular } as ProfessorTitular?
            val professorAdjunto: ProfessorAdjunto? = professores.find { it.codigoProfessor == codigoProfessorAdjunto } as ProfessorAdjunto?

            when {
                curso == null -> println("Curso (cód. $codigoCurso) inválido!")
                professorTitular == null -> println("Professor(a) Titular (cód. $codigoCurso) inválido(a)!")
                professorAdjunto == null -> println("Professor(a) Adjunto(a) (cód. $codigoCurso) inválido(a)!")
                else -> {
                    curso.alocarProfessorTitular(professorTitular)
                    curso.alocarProfessorAdjunto(professorAdjunto)
                }
            }
        } catch (e: ClassCastException) {
            println("Não foi possível realizar alocação. Verifique categorias dos(as) professores(as).")
        }
    }

}

