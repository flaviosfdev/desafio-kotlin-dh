package testes

import DigitalHouseManager

fun main() {

    val adminProfessores = DigitalHouseManager()

    adminProfessores.registrarProfessorAdjunto("Jonatas", "Araújo", 1, 4)

    println()
    adminProfessores.registrarProfessorAdjunto("Romário", "Ferreira", 1, 4)

    println()
    adminProfessores.registrarProfessorTitular("Romário", "Ferreira", 2, "Android")

    println()
    adminProfessores.registrarProfessorTitular("Jonatas", "Araújo", 1, "Android")

    println()
    println("===== Professores Cadastrados =====")
    println(adminProfessores.imprimirListaDeProfessores())

    println()
    adminProfessores.excluirProfessor( 3)

    println()
    adminProfessores.excluirProfessor( 1)

    println()
    println("===== Professores Cadastrados =====")
    println(adminProfessores.imprimirListaDeProfessores())

}