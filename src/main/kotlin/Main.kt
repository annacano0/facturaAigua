fun main() {
    startOfProgramMessage()
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

    //check which discount is bigger
    var socialDiscountIsBigger=false
    if (socialBonusDiscount>numerousFamilyDiscount){
        socialDiscountIsBigger=true
        fixedImport=3
    }

    val finalDiscount= calculateFinalDiscount(basePrice,numerousFamilyDiscount,socialBonusDiscount)
    printFinalBill(litersWater,basePrice,finalDiscount,fixedImport)
    endOfProgramMessage()
}