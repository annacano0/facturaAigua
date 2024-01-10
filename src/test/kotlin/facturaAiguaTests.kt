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
        ///TODO:acabar de corregir tests
        //assertTrue(calculateDiscountNumerousFamily() is Int)
        var expected=50
        //assertEquals(expected, calculateBasePrice())
    }
}