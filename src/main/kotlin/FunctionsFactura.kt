fun calculateBasePrice(liters:Float):Float{
    var basePrice=0f
    var pricePerLiter=0.0f
    if (liters>=50&&liters<=200)pricePerLiter=0.15f
    else if (liters>200) pricePerLiter=0.30f
    basePrice=liters*pricePerLiter
    return basePrice.toDouble().round(2)
}

fun calculateDiscountNumerousFamily():Int{
    val numPeople=readIntRange("Introdueixi el num de persones de la llar", 2, 25)
    var descompte=0
    if (numPeople>6) descompte=50
    else descompte = numPeople*10
    return descompte
}
fun calculateFinalDiscount(basePrice:Float,numerousFamily:Int, socialBonus:Int):Float{
    var discount=0
    if (numerousFamily>socialBonus)discount=numerousFamily
    else discount=socialBonus
    val finalDiscount=(discount*basePrice)/100
    return finalDiscount.toDouble().round(2)
}
fun printFinalBill(liters:Float,base:Float,discount:Float,socialDiscount:Boolean, fixedImport:Int){
    separador()
    println("         FACTURA DE L'AIGUA          ")
    separador()
    println("\nConsum..................."+liters+" litres")
    println("Preu base......................"+base+" €")
    separador()

    if (socialDiscount)println("Descompte social................"+discount+" €")
    else println("Descompte mp/num................"+discount+" €")

    println("Quota manteniment................."+fixedImport+" €\n")
    val total=base-discount+fixedImport
    separador()
    println("TOTAL.........................."+total.toDouble().round(2)+" €")
    separador()
}

