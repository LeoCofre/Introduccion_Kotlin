import java.security.DrbgParameters

fun main() {
    println("Mi nombre es : Leo Cofré")
    val a = 10
    val b = 20

    val c = 30
    val resultado = a + b + c
    println("$a + $b + $c = $resultado")
    val string = "Arataka Reigen"
    var char = 'A'
    println("Valor de char $char")
    val contadorCaracteres = "La variable String Tiene ${string.count()} caracteres"
    println(contadorCaracteres)
    char = 'B' // Asignando nuevo valor a 'char'
    println("Nuevo valor de char $char")
    var d = 10.0f
    println("Valor inicial de float $d")
    d = 20.00f  // Asignando nuevo valor a float
    println("Nuevo valor de float $d")

    val byteMaximo = Byte.MAX_VALUE
    println("Valor maximo de almacenamiento byte $byteMaximo")
    val shortMaximo = Short.MAX_VALUE
    println("Valor maximo de almacenamiento short $shortMaximo")

    val intMinimo = Int.MIN_VALUE
    println("Valor minimo de almacenamiento int $intMinimo")
    val longMinimo = Long.MIN_VALUE
    println("Valor minimo de almacenamiento long $longMinimo")

    val v = true
    val f: Boolean = false

    println("Valor de v es $v")
    println("Valor de f es $f")

    fun imprimiendoParametros(parametro1: String, parametro2: String) {
        println(parametro1.count())
        println(parametro2.count())
    }
    fun obtieneIVA (int: Int){
        int = int * 1.19
        println(int)


    }

}