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
    adminCursos.cursos.forEach { println("Curso: ${it.nome} - Cód. ${it.codigoCurso}") }

    println()
    println("Deletando Curso cód. 5")
    adminCursos.excluirCurso(5)
    println()

    println("Deletando Curso cód. 2")
    adminCursos.excluirCurso(2)
    println()

    println("===== Cursos Cadastrados =====")
    adminCursos.cursos.forEach { println("Curso: ${it.nome} - Cód. ${it.codigoCurso}") }

    println("Criando curso cod 2 novamente")
    adminCursos.registrarCurso("Desenvolvimento Back-End", 2, 2)
    println()

    println("===== Cursos Cadastrados =====")
    adminCursos.cursos.forEach { println("Curso: ${it.nome} - Cód. ${it.codigoCurso}") }
}
