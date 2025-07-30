import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val nameSantiago: String = "Kevin Santiago Lozano Garzón"

    val name = "Samuel"
    val age = 20

    println("$name is $age years old")

    val NameList = listOf("Sr Smith", "Mr Kevin", "Pdte Castillo")
    println(NameList)
/*
    val languageName = "Kotlin"

    println(languageName.uppercase())

    //Sirve para especificar una variabe valor nulo
    val languageName1: Int? = null

    println(languageName1)
    */

    val numSantiago: Int = 57
    val numSamuel: Int = 21
    val numSmith: Int = 10



    if(numSantiago == numSantiago){
        println("El numero que aparece es el de Santiago")
    }else if(numSamuel==numSamuel){
        println("EL numero que aparece es el de Samuel")
    }else if(numSmith==numSmith){
        println("El numero que aparece es el de Smith")
    }else{
        println("Este numero no esta establecido para alguien")
    }



    print("Ingrese su nombre: ")
    val nameUser = readln()
    print("Ingrese su edad: ")
    val ageUser = readln().toInt()

    val respuestaEnTexto: String = if (ageUser >= 18) {
        "Usted es mayor de edad"
    }else {
        "Ustes es menor de edad"
    }
    println("Hola , $nameUser $respuestaEnTexto")

    print("Ingrese su nombre: ")
    val nameUser1 = readln()
    print("Ingrese su edad: ")
    val ageUser1  = readln().toInt()


    val respuestaEnTexto1 = when{
        ageUser1 >= 18 -> "Usted es mayor de edad"
        ageUser1 < 18 -> "Usted es menor de edad"
        else -> "Prueba de error"
    }
    println(respuestaEnTexto1)


    val languageName: String? = null
    if (languageName != null) {
        // No need to write languageName?.toUpperCase()
        println(languageName)
    }


    fun crearRespuestaEnTexto () : String{
        print("Ingrese su edad: ")
        val ageUser = readln().toInt()

        val respuesta =  if (ageUser >= 18) {
            "Usted es mayor de edad"
        }else{
            "Usted es menor de edad"
        }

        return respuesta
    }
}
