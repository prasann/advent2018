package D03P1

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class ClaimTest {
    @Test
    fun shouldCreateClaim() {
        val actualClaim = Claim.stringToClaim("#123 @ 3,2: 5x4")
        actualClaim.let {
            assertEquals(123, it.id)
            assertEquals(3, it.leftEdge)
            assertEquals(2, it.topEdge)
            assertEquals(5, it.width)
            assertEquals(4, it.height)
        }
    }

    @Test
    fun shouldReturnClaimArea() {
        val actualClaim = Claim.stringToClaim("#123 @ 3,2: 5x4")
        val actualArea = actualClaim.area()
        assertEquals(20, actualArea.size)
    }
}