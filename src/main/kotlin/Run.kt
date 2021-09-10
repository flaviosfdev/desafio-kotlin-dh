fun main() {

    val admin = DigitalHouseManager()

    println("===== Registrando Professores =====")
    admin.registrarProfessorTitular("Romário", "Ferreira", 1, "Android")
    admin.registrarProfessorAdjunto("Jonatas", "Araújo", 2, 3)
    admin.registrarProfessorTitular("João", "Maria", 3, "Android")
    admin.registrarProfessorAdjunto("Cicrano", "Silva", 4, 4)
    println()

    println("===== Registrando Cursos =====")
    admin.registrarCurso("Dev. Full Stack", 20001, 3)
    admin.registrarCurso("Dev. Android", 20002, 2)
    println()

    println("===== Alocando Professores =====")
    admin.alocarProfessores(20002, 1, 2)
    println()
    admin.alocarProfessores(20001, 3, 4)
    println()

    println("===== Matriculando Alunos na DH =====")
    admin.matricularAluno("Flávio", "Ferreira", 1)
    admin.matricularAluno("Paulo", "Victor", 2)
    admin.matricularAluno("Everton", "Antunes", 3)
    admin.matricularAluno("Denise", "Azevedo", 4)
    admin.matricularAluno("Celso", "Matiazi", 5)
    println()

    println("===== Matriculando Alunos nos Cursos =====")
    admin.matricularAluno(1,20001)
    admin.matricularAluno(2,20001)
    admin.matricularAluno(3,20002)
    admin.matricularAluno(4,20002)
    admin.matricularAluno(5,20002)

}