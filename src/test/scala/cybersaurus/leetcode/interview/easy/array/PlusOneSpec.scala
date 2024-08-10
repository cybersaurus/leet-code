package cybersaurus.leetcode.interview.easy.array

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class PlusOneSpec extends AnyWordSpec with Matchers {
  "PlusOne" should {
    "add 1 to simple number" in {
      val digits = Array(7)

      PlusOne.plusOne(digits) shouldBe Array(8)
    }

    "add 1 and add new element when current updated value is already 9" in {
      val digits = Array(9)

      PlusOne.plusOne(digits) shouldBe Array(1, 0)
    }

    "add 1 and add new element when current updated value is already 9, recursively" in {
      val digits = Array(9, 9, 9)

      PlusOne.plusOne(digits) shouldBe Array(1, 0, 0, 0)
    }
  }
}
