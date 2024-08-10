package cybersaurus.leetcode.interview.easy.array

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class SingleNumberSpec extends AnyWordSpec with Matchers {
  "SingleNumber" should {
    "return the number for an Array containing 1 element" in {
      SingleNumber.singleNumber(Array(1)) shouldBe 1
    }

    "return 1 for an Array containing [2,2,1]" in {
      SingleNumber.singleNumber(Array(2,2,1)) shouldBe 1
    }

    "return 1 for an Array containing [4,1,2,1,2]" in {
      SingleNumber.singleNumber(Array(4,1,2,1,2)) shouldBe 4
    }
  }
}
