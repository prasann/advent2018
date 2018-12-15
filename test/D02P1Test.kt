import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class D02P1Test {
    private val classUnderTest = D02P1()

    @Test
    fun shouldReturnAMapFromString() {
        val actualResult = classUnderTest.stringToMap("aabbcde")
        assertEquals(5, actualResult.size)
        assertEquals(2, actualResult.get('a'))
        assertEquals(2, actualResult.get('b'))
        assertEquals(1, actualResult.get('c'))
        assertEquals(1, actualResult.get('d'))
        assertEquals(1, actualResult.get('e'))
    }

    @Test
    fun shouldReturnTrueForMapWith2Chars() {
        assertTrue(classUnderTest.hasTwoChars(mapOf('a' to 1, 'b' to 2)))
    }

    @Test
    fun shouldReturnFalseForMapWith2Chars() {
        assertFalse(classUnderTest.hasTwoChars(mapOf('a' to 3, 'b' to 1)))
    }

    @Test
    fun shouldRunTheTest() {
        val input = listOf("crruafyzloguvxwctqmphenbkd")
        println(classUnderTest.checksum(input))
    }
}