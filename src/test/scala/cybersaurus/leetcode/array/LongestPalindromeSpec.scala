package cybersaurus.leetcode.array

import org.scalatest.{Matchers, WordSpec}

class LongestPalindromeSpec extends WordSpec with Matchers {
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
