package cybersaurus.leetcode.interview.medium.array

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class LongestPalindromeSpec extends AnyWordSpec with Matchers {
  "LongestPalindrome" should {
    "return empty string for empty input" in {
      LongestPalindrome.longestPalindrome("") shouldBe ""
    }

    "bab in babad" in {
      LongestPalindrome.longestPalindrome("babad") shouldBe "bab"
    }

    "bb in cbbd" in {
      LongestPalindrome.longestPalindrome("cbbd") shouldBe "bb"
    }

    "dad in cbbdad" in {
      LongestPalindrome.longestPalindrome("cbbdad") shouldBe "dad"
    }

    "babaddtattarrattatddetartrateedredividerb" in {
      LongestPalindrome.longestPalindrome("babaddtattarrattatddetartrateedredividerb") shouldBe "ddtattarrattatdd"
    }
  }

}
