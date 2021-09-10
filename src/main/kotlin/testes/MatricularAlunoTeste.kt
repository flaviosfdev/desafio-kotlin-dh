package testes

import DigitalHouseManager

fun main() {

    val admin = DigitalHouseManager()

    println(admin.imprimirCursosCadastrados())
    println(admin.imprimirListaDeProfessores())
    println()
    admin.registrarCurso("Android", 1, 2)
    admin.registrarCurso("FullStack", 2, 2)
    admin.registrarCurso("Marketing", 3, 2)
    admin.registrarProfessorTitular("Romário", "Ferreira", 1, "Andriod")
    admin.registrarProfessorAdjunto("Jonatas", "Araújo", 2, 3)
    println()
    println(admin.imprimirCursosCadastrados())
    println(admin.imprimirListaDeProfessores())

    admin.matricularAluno("Flávio", "Ferreira", 1)
    println()
    admin.matricularAluno("José", "Silva", 2)
    println()
    admin.matricularAluno("Paulo", "Victor", 1)
    println()

    admin.matricularAluno(3, 4) // aluno e curso inválidos
    admin.matricularAluno(3, 1) // aluno inválido
    admin.matricularAluno(1, 4) // curso inválido
    admin.matricularAluno(1, 1) // aluno e curso válidos

}