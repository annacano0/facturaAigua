/** /*This function gets the base price of bill using liters of water User has consumed.
    Depending on how many liters, the price per liter will cost more*/
 * @author annacano0
 * @since 11/01/2024
 * @param liters consumption of liters by User
 * @return basePrice value of base price
 */
fun calculateBasePrice(liters:Float):Float{
    var basePrice=0f
    var pricePerLiter=0.0f//initial value or liter
    if (liters>=50&&liters<=200)pricePerLiter=0.15f//value per liter if liters is 50 or more
    else if (liters>200) pricePerLiter=0.30f//value per liter if liters is bigger than 200
    basePrice=liters*pricePerLiter//multiply liter by the price per liter to get price
    return basePrice
}

/** /*This function calculates the % of discount User will have on base price if they belong to a
monoparental family or a family of 4 or more*/
 * @author annacano0
 * @since 11/01/2024
 * @param numPeople people living in the household
 * @return descompte percentage of discount on final price
 */
fun calculateDiscountNumerousFamily(numPeople:Int):Int{
    var descompte=0
    if (numPeople>6) descompte=50//the discount doesn't change after 5 people in the household
    else if (numPeople<2) descompte=0//a familiar unit can't be less than two people, in this case there would be no discount
    else descompte = numPeople*10
    return descompte
}
/** /*This function gets the % of discount User will get the most benefit of and
calculates what it will be (from basePrice)*/
 * @author annacano0
 * @since 11/01/2024
 * @param basePrice basePrice with no suplements or discounts
 * @param numerousFamily percentage of discount for numerous family
 * @param socialBonus percentage of discount for socialBonus
 * @return finalDiscount value of money that will be discounted
 */
fun calculateFinalDiscount(basePrice:Float,numerousFamily:Int, socialBonus:Int):Float{
    var discount=0
    if (numerousFamily>socialBonus)discount=numerousFamily//if numerousFamily discount is bigger, it will be used to favour the user
    else discount=socialBonus//if socialBonus is bigger, it will be used
    val finalDiscount=(discount*basePrice)/100
    return finalDiscount
}

/** /*This function calculates the final import of bill via all the price data collected*/
 * @author annacano0
 * @since 11/01/2024
 * @param base base price with no suplements or discounts
 * @param discount amount to discount to price
 * @param fixedImport tax of maintenance
 * @return total Final price of bill
 */
fun getFinalPrice(base:Float,discount:Float, fixedImport:Int):Float{
    var total=base-discount+fixedImport
    if (total<0) total=0f
    return total
}


