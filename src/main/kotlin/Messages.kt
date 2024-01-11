/**
 *This function prints welcome message at the start of every iteration of program with blue bold color
 * @author Thalia2603, annacano0
 * @since 04/01/2024
 */
fun startOfProgramMessage(){
    println(BLUE_BRIGHT+"--------------------------------")
    println("          Benvolgut/da          ")
    println("--------------------------------"+RESET)
}

/**
 *This function prints goodbye message at the end of every iteration of program with blue bold color
 * @author Thalia2603, annacano0
 * @since 04/01/2024
 */
fun endOfProgramMessage(){
    println(BLUE_BOLD_BRIGHT+"                 Adeu!          "+RESET)
}

/**
 *This function prints Data Type error message (used in functions that check input) in red
 * @author Thalia2603, annacano0
 * @since 04/01/2024
 */
fun messageErrorDT(){
    //funcion que es llamada cuando el tipo de dato es incorrecto
    println(RED_BOLD+"El tipus de dada és incorrecte, torni a intentar."+RESET)
}
/**
 *This function prints range error message (used in functions that check input) in yellow
 * @author Thalia2603, annacano0
 * @since 04/01/2024
 */
fun messageErrorRange(){
    //funcion que es llamada cuando el tipo de dato esta fuera del rango establecido
    println(YELLOW_BOLD+"El tipus de dada no està en les opcions, torni a intentar."+RESET)
}

fun separador(){
    println("-------------------------------------")
}

fun printFinalBill(liters:Float,base:Float,discount:Float, fixedImport:Int, total:Float){
    separador()
    println("         FACTURA DE L'AIGUA          ")
    separador()
    println("\nConsum..................."+liters+" litres")
    println("Preu base......................"+base.toDouble().round(2)+" €")
    separador()

    if (fixedImport==3)println("Descompte social................"+discount.toDouble().round(2)+" €")
    else println("Descompte mp/num................"+discount.toDouble().round(2)+" €")

    println("Quota manteniment................."+fixedImport.toDouble().round(2)+" €\n")
    separador()
    println("TOTAL.........................."+total+" €")
    separador()
}

