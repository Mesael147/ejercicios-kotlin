import kotlin.random.Random

fun main() {

    var cara= 1
    var sello= 2
    var lanzarMoneda: Int =0
    var contadorSello: Int=0
    var contadorCara: Int=0
    while (lanzarMoneda <=19){
        val caeMoneda: Int= Random.nextInt(1, 3)
        if (caeMoneda==sello){
        contadorSello++
        }else if (caeMoneda==cara){
        contadorCara++
        }
    lanzarMoneda++
    }
    if (contadorSello>contadorCara){
        println("sello gana con")
        println(contadorSello)
    }else if (contadorCara>contadorSello){
        println("cara gana con")
        println(contadorCara)
    }






}