package Lista03

//Crie uma classe chamada “NúmerosPares” que:
//Exiba todos os números pares de 0 a 40 usando while.

fun main() {
    for( i in 0..40){
        if(i % 2 == 0){
            println(i)
        }
    }
}