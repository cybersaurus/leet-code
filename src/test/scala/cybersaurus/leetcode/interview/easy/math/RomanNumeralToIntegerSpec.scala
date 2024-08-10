package cybersaurus.leetcode.interview.easy.math

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class RomanNumeralToIntegerSpec extends AnyWordSpec with Matchers {
  "RomanNumeralToInteger" should {
    "return zero for empty input" in {
      RomanNumeralToInteger.romanToInt("") shouldBe 0
    }

    "I is 1" in {
      RomanNumeralToInteger.romanToInt("I") shouldBe 1
    }

    "II is 2" in {
      RomanNumeralToInteger.romanToInt("II") shouldBe 2
    }

    "III is 3" in {
      RomanNumeralToInteger.romanToInt("III") shouldBe 3
    }

    "IV is 4" in {
      RomanNumeralToInteger.romanToInt("IV") shouldBe 4
    }

    "MCMXCIV is 1994" in {
      RomanNumeralToInteger.romanToInt("MCMXCIV") shouldBe 1994
    }

    "ii is 2" in {
      RomanNumeralToInteger.romanToInt("ii") shouldBe 2
    }
  }
}
