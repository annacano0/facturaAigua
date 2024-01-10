import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class testFunctionsFactura() {
    @Test
    fun checkCalculateBasePrice(){
        assertTrue(calculateBasePrice(50f) is Float)

        var expected=0f
        assertEquals(expected, calculateBasePrice(0f))
        assertEquals(expected, calculateBasePrice(49.99f))

        expected=7.65f
        assertEquals(expected, calculateBasePrice(51f))//0.15 por litro

        expected=200*0.15f
        assertEquals(expected, calculateBasePrice(200f))//0.15 por litro

        expected=200.5f*0.3f
        assertEquals(expected,calculateBasePrice(200.5f))//comprobar que no falle con decimales
    }

    @Test
    fun checkCalculateDiscountNumerousFamily(){
        assertTrue(calculateDiscountNumerousFamily(10) is Int)

        var expected=50
        assertEquals(expected, calculateDiscountNumerousFamily(10))

        expected=20
        assertEquals(expected, calculateDiscountNumerousFamily(2))

        expected=0
        assertEquals(expected, calculateDiscountNumerousFamily(1))
    }

    @Test
    fun checkCalculateFinalDiscount(){
        var expected=12f
        var basePrice=15f
        var numerousFamily=20
        var socialDiscount=80
        assertEquals(expected, calculateFinalDiscount(basePrice,numerousFamily,socialDiscount))

        expected=0f
        basePrice=0f
        numerousFamily=0
        socialDiscount=0
        assertEquals(expected, calculateFinalDiscount(basePrice,numerousFamily,socialDiscount))

        expected=25f
        basePrice=100f
        numerousFamily=25
        socialDiscount=0
        assertEquals(expected, calculateFinalDiscount(basePrice,numerousFamily,socialDiscount))
    }
}