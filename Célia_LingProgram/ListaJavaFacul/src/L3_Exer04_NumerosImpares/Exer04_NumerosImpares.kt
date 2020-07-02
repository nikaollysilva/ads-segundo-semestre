package Lista03

//Crie uma classe chamada “NúmerosImpares” que:
//Usando for, exiba todos os números ímpares entre 0 e 90

fun main() {
    for (i: Int in 0..90) {
        if (i % 2 != 0) {
            println(i)
        }
    }
}