package testes

import DigitalHouseManager

fun main() {

    val adminProfessores = DigitalHouseManager()

    println("Criando curso cod 1")
    adminProfessores.registrarCurso("Desenvolvimento Android", 1, 2)
    println()


    adminProfessores.registrarProfessorAdjunto("Jonatas", "Araújo", 1, 4) // professor adjunto cadastrado

    println()
    adminProfessores.registrarProfessorAdjunto("Romário", "Ferreira", 1, 4) // professor adjunto não cadastrado

    println()
    adminProfessores.registrarProfessorTitular("Romário", "Ferreira", 2, "Android") // professor titular cadastrado

    println()
    adminProfessores.registrarProfessorTitular("Jonatas", "Araújo", 1, "Android") // professor titular não cadastrado

    println()
    adminProfessores.registrarProfessorTitular("Flávio", "Ferreira", 3, "Android") // professor titular cadastrado

    println()
    println("===== Professores Cadastrados =====")
    println(adminProfessores.imprimirListaDeProfessores()) // lista de professores

    println()
    adminProfessores.excluirProfessor(4) // professor inválido

    println()
    adminProfessores.excluirProfessor(3) // professor

    println()
    println("===== Professores Cadastrados =====")
    println(adminProfessores.imprimirListaDeProfessores()) // lista de professores

    adminProfessores.alocarProfessores(2, 2, 1) // curso inválido
    println()
    adminProfessores.alocarProfessores(1, 9, 1) // prof titular inválido
    println()
    adminProfessores.alocarProfessores(1, 2, 9) // prof adjunto inválido
    println()
    adminProfessores.alocarProfessores(1, 2, 1) // teste válido

}