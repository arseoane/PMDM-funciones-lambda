fun main() {
    suma(2,3)
    suma(b=12)
}

fun suma (a: Int=0, b: Int): Unit {
    val resultado = a+b
    println("El resultado es: $resultado")
}