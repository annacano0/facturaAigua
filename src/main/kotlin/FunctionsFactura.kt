fun calculateBasePrice(liters:Float):Float{
    var basePrice=0f
    var pricePerLiter=0.0f
    if (liters>=50&&liters<=200)pricePerLiter=0.15f
    else if (liters>200) pricePerLiter=0.30f
    basePrice=liters*pricePerLiter
    return basePrice
}

fun calculateDiscountNumerousFamily(numPeople:Int):Int{
    var descompte=0
    if (numPeople>6) descompte=50
    else if (numPeople<2) descompte=0
    else descompte = numPeople*10
    return descompte
}
fun calculateFinalDiscount(basePrice:Float,numerousFamily:Int, socialBonus:Int):Float{
    var discount=0
    if (numerousFamily>socialBonus)discount=numerousFamily
    else discount=socialBonus
    val finalDiscount=(discount*basePrice)/100
    return finalDiscount
}

fun getFinalPrice(base:Float,discount:Float, fixedImport:Int):Float{
    var total=base-discount+fixedImport
    if (total<0) total=0f
    return total
}


