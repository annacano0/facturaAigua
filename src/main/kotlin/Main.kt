fun main() {
    startOfProgramMessage()
    //demanar litres consumits i validar
    var fixedImport=6
    val litersWater=readFloat("Introdueixi els litres consumits:", 0.0f)
    val basePrice=calculateBasePrice(litersWater)

    //preguntar si es faminia nombrosa/monoparental
    val numerousFamily=readStringSiNo("Es familia nombrosa/monoparental? (Si/No)")
    var numerousFamilyDiscount=0
    if (numerousFamily) numerousFamilyDiscount= calculateDiscountNumerousFamily()
    //Preguntar abonament social

    val socialBonus=readStringSiNo("Té algun tipus d'abonament social? (Si/No)")
    var socialBonusDiscount=0
    if (socialBonus) socialBonusDiscount= 80
    var socialDiscountIsBigger=false
    if (socialBonusDiscount>numerousFamilyDiscount){
        socialDiscountIsBigger=true
        fixedImport=3
    }

    val finalDiscount= calculateFinalDiscount(basePrice,numerousFamilyDiscount,socialBonusDiscount)
    printFinalBill(litersWater,basePrice,finalDiscount,socialDiscountIsBigger,fixedImport)
    endOfProgramMessage()
}