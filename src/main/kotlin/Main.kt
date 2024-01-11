/*program that prints welcome message, and calculates and prints through programExecution()
    the bill of User. Then asks if user wants to caculate again. If they don't,
    then program ends printing a goodbye message.
    */
fun main() {
    do {
        startOfProgramMessage()
        programExecution()//execution of program
        val exit=readStringSiNo("Desitja calcular una altra factura? (Si/No)")//ask user if the want to repeat program
        separador()//text separator
    }while (exit)
    endOfProgramMessage()
}

/**
/*This method calculates the price of the bill by getting info from User via other
methods from FunctionsFactura.kt and interacts with user via functions in Utilities
(that validate inputs) and printed messages (including the final bill) from Messages.kt*/
 * @author annacano0
 * @since 11/01/2024
 */
fun programExecution(){
    //ask for liters user has consumed
    var fixedImport=6
    val litersWater=readFloat("Introdueixi els litres consumits:", 0.0f)
    val basePrice=calculateBasePrice(litersWater)

    //ask if user qualifies for family discount
    val numerousFamily=readStringSiNo("Es familia nombrosa/monoparental? (Si/No)")
    var numerousFamilyDiscount=0
    if (numerousFamily){
        val numPeople=readIntRange("Introdueixi el num de persones de la llar", 2, 25)
        numerousFamilyDiscount= calculateDiscountNumerousFamily(numPeople)
    }
    //ask if user has social bonus
    val socialBonus=readStringSiNo("Té algun tipus d'abonament social? (Si/No)")
    var socialBonusDiscount=0
    if (socialBonus) socialBonusDiscount= 80

    //check which discount is bigger to keep it
    var socialDiscountIsBigger=false
    if (socialBonusDiscount>numerousFamilyDiscount){
        socialDiscountIsBigger=true
        fixedImport=3//if user has social bonus, the fixed import gets reduced to 3
    }
    //get final price and print bill
    val finalDiscount= calculateFinalDiscount(basePrice,numerousFamilyDiscount,socialBonusDiscount)
    val total= getFinalPrice(basePrice,finalDiscount,fixedImport)
    printFinalBill(litersWater,basePrice,finalDiscount,fixedImport,total)
}