class Aluno(val nome: String, val sobrenome: String, val codigoAluno: Int) {

    override fun equals(other: Any?): Boolean = (other is Aluno && this.codigoAluno == other.codigoAluno)

}