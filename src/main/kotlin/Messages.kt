fun startOfProgramMessage(){
    println(BLUE_BRIGHT+"----------------------------")
    println("        Benvolgut/da        ")
    println("----------------------------"+RESET)
}

/**
 *This function prints goodbye message at the end of every iteration of program with blue bold color
 * @author Thalia2603, annacano0
 * @since 04/01/2024
 */
fun endOfProgramMessage(){
    println(BLUE_BOLD_BRIGHT+"         Bon Viatge!        "+RESET)
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