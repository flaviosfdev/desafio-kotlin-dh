package testes

import DigitalHouseManager

fun main() {

    val admin = DigitalHouseManager()
    println("Criando curso cod 1")
    admin.registrarCurso("Desenvolvimento Android", 1, 2)
    println()

    println("Criando curso cod 1 novamente")
    admin.registrarCurso("Desenvolvimento Flutter", 1, 2)
    println()

    println("Criando curso cod 2")
    admin.registrarCurso("Desenvolvimento IOS", 2, 2)
    println()

    println("Criando curso cod 3")
    admin.registrarCurso("Desenvolvimento Front-End", 3, 2)
    println()

    println("Criando curso cod 2 novamente")
    admin.registrarCurso("Desenvolvimento Back-End", 2, 2)
    println()

    println("===== Cursos Cadastrados =====")
    admin.cursos.forEach { println("Curso: ${it.nome} - Cód. ${it.codigoCurso}") }

    println()
    println("Deletando Curso cód. 5")
    admin.excluirCurso(5)
    println()

    println("Deletando Curso cód. 2")
    admin.excluirCurso(2)
    println()

    println("===== Cursos Cadastrados =====")
    admin.cursos.forEach { println("Curso: ${it.nome} - Cód. ${it.codigoCurso}") }

    println("Criando curso cod 2 novamente")
    admin.registrarCurso("Desenvolvimento Back-End", 2, 2)
    println()

    println("===== Cursos Cadastrados =====")
    admin.cursos.forEach { println("Curso: ${it.nome} - Cód. ${it.codigoCurso}") }
}
