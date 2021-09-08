abstract class Professor(
    var nome: String,
    var sobrenome: String,
    val codigoProfessor: Int,
) {

    var tempoDeCasa: Int = 0

    override fun equals(other: Any?): Boolean =
        (other is Professor && this.codigoProfessor == other.codigoProfessor)

}