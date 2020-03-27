package Lista03

//
//Crie uma classe chamada “ContadorVariado” que:
//Usando for, começe exibindo o valor 0.15 e depois 0.30, depois 0.45, depois 0.60... ou
//seja, aumente de 0.15 em 0.15 a cada iteração até que o último número seja
//menor que 5.

fun main() {
    var a = 0.15
    val targetFinal = 5

    var i = 0.15
    while (i < targetFinal) {
        println(String.format("%.2f", i))
        i += a
    }
}