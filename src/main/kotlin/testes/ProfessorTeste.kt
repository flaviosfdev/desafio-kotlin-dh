package testes

import DigitalHouseManager
import ProfessorAdjunto

fun main() {

    val adminProfs = DigitalHouseManager()

    adminProfs.registrarProfessorAdjunto("Jonatas", "Araújo", 1, 4)

    println()
    adminProfs.registrarProfessorAdjunto("Romário", "Ferreira", 1, 4)

    println()
    adminProfs.registrarProfessorTitular("Romário", "Ferreira", 2, "Android")

    println()
    adminProfs.registrarProfessorTitular("Jonatas", "Araújo", 1, "Android")

    println()
    println("===== Professores Cadastrados =====")
    imprimirListaDeProfessores(adminProfs)

    println()
    adminProfs.excluirProfessor( 3)

    println()
    adminProfs.excluirProfessor( 1)

    println()
    println("===== Professores Cadastrados =====")
    imprimirListaDeProfessores(adminProfs)

}

private fun imprimirListaDeProfessores(adm: DigitalHouseManager) {
    adm.professores.forEach {
        if (it is ProfessorAdjunto) {
            println("${it.nome} ${it.sobrenome} - Cód. (${it.codigoProfessor}) Adjunto")
        } else {
            println("${it.nome} ${it.sobrenome} - Cód. (${it.codigoProfessor}) Titular")
        }
    }
}