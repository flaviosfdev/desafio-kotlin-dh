class Curso(val nome: String, val codigoCurso: Int) {

    override fun equals(other: Any?): Boolean = (other is Curso && this.codigoCurso == other.codigoCurso)

}