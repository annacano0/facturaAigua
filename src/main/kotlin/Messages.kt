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
    println(RED_BOLD+"El tipus de dada és incorrecte, torni a intentar."+RESET)
}
/**
 *This function prints range error message (used in functions that check input) in yellow
 * @author Thalia2603, annacano0
 * @since 04/01/2024
 */
fun messageErrorRange(){
    println(YELLOW_BOLD+"El tipus de dada no està en les opcions, torni a intentar."+RESET)
}

/**
 *This function prints text separator
 * @author annacano0
 * @since 11/01/2024
 */
fun separador(){
    println("-------------------------------------")
}

/**
 /*This function prints the final bill with the concepts separated in bill format and with rounded values.
 If User has social bonus, it also changes the message*/
 * @author annacano0
 * @since 11/01/2024
 * @param liters consumption of liters by user
 * @param base base price calculated from liters
 * @param discount discount applied
 * @param fixedImport fixed quote of maintenance
 * @param total total sum to pay
 */
fun printFinalBill(liters:Float,base:Float,discount:Float, fixedImport:Int, total:Float){
    separador()
    println("         FACTURA DE L'AIGUA          ")
    separador()
    println("\nConsum..................."+liters+" litres")
    println("Preu base......................"+base.toDouble().round(2)+" €")
    separador()
    //with the fixed quote we can know if social bonus has been applied and change message on bill
    if (fixedImport==3)println("Descompte social................"+discount.toDouble().round(2)+" €")
    else println("Descompte mp/num................"+discount.toDouble().round(2)+" €")

    println("Quota manteniment................."+fixedImport.toDouble().round(2)+" €\n")
    separador()
    println("TOTAL.........................."+total.toDouble().round(2)+" €")
    separador()
}

