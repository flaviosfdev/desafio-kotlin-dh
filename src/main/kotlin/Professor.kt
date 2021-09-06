abstract class Professor(
    val nome: String,
    val sobrenome: String,
    var tempoDeCasa: Int,
    val codigoProfessor: Int
) {

    override fun equals(other: Any?): Boolean = (other is Professor && this.codigoProfessor == other.codigoProfessor)

}