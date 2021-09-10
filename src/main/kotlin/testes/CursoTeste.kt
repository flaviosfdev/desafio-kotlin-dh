package testes

import DigitalHouseManager

fun main() {

    val adminCursos = DigitalHouseManager()
    println("Criando curso cod 1")
    adminCursos.registrarCurso("Desenvolvimento Android", 1, 2)
    println()

    println("Criando curso cod 1 novamente")
    adminCursos.registrarCurso("Desenvolvimento Flutter", 1, 2)
    println()

    println("Criando curso cod 2")
    adminCursos.registrarCurso("Desenvolvimento IOS", 2, 2)
    println()

    println("Criando curso cod 3")
    adminCursos.registrarCurso("Desenvolvimento Front-End", 3, 2)
    println()

    println("Criando curso cod 2 novamente")
    adminCursos.registrarCurso("Desenvolvimento Back-End", 2, 2)
    println()

    println("===== Cursos Cadastrados =====")
    println(adminCursos.imprimirCursosCadastrados())

    println()
    println("Deletando Curso cód. 5")
    adminCursos.excluirCurso(5)
    println()

    println("Deletando Curso cód. 2")
    adminCursos.excluirCurso(2)
    println()

    println("===== Cursos Cadastrados =====")
    println(adminCursos.imprimirCursosCadastrados())

    println("Criando curso cod 2 novamente")
    adminCursos.registrarCurso("Desenvolvimento Back-End", 2, 2)
    println()

    println(adminCursos.imprimirCursosCadastrados()) // lista de cursos cadastrados

    adminCursos.matricularAluno("Flávio", "Ferreira", 1) // criando aluno
    adminCursos.matricularAluno(1,  1) // add aluno ao curso

    println()
    adminCursos.alterarQuantidadeMaximaDeAlunosEmCurso(5, 0) // curso inválido
    adminCursos.alterarQuantidadeMaximaDeAlunosEmCurso(1, -5) // quantidade inválida menor que zero
    adminCursos.alterarQuantidadeMaximaDeAlunosEmCurso(1, 0) // quantidade inválida menor que alunos matriculados
    adminCursos.alterarQuantidadeMaximaDeAlunosEmCurso(1, 1) // curso e quantidade válidos
}