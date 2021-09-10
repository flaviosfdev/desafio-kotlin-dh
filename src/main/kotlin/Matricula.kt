import java.util.*

class Matricula(
    val aluno: Aluno,
    val curso: Curso,
    private var dataDeMatricula: String = ""
) {

    init {
        dataDeMatricula = gerarData()
    }

    private fun gerarData(): String {

        val data = Calendar.getInstance()

        val ano = data.get(Calendar.YEAR)
        val mes = if (data.get(Calendar.MONTH) < 9) "0${data.get(Calendar.MONTH)+1}" else "${data.get(Calendar.MONTH)+1}"
        val dia = if (data.get(Calendar.DATE) < 9) "0${data.get(Calendar.MONTH)}" else "${data.get(Calendar.DATE)}"

        return "$ano$mes$dia"
    }


    override fun toString(): String = "A${aluno.codigoAluno}D${dataDeMatricula}C${curso.codigoCurso}"

}