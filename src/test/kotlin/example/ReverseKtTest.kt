package example

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class ReverseKtTest {
    @Test
    fun one() = assertEquals("blue is sky the", reverseWords("the sky is blue"))

    @Test
    fun two() = assertEquals("world hello", reverseWords("  hello world  "))

    @Test
    fun three() = assertEquals("example good a", reverseWords("a good   example"))
}
