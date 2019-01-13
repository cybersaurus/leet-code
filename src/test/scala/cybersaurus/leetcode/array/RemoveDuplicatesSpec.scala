package cybersaurus.leetcode.array

import org.scalatest.{Matchers, WordSpec}

class RemoveDuplicatesSpec extends WordSpec with Matchers {

  "RemoveDuplicates" should {
    "return zero for an empty Array" in {
      val data = Array[Int]()
      RemoveDuplicates.removeDuplicates(data) shouldBe 0
      data shouldBe Array[Int]()
    }

    "return one for a sorted Array containing a single element" in {
      val data = Array(1)
      RemoveDuplicates.removeDuplicates(data) shouldBe 1
      data.take(1) shouldBe Array(1)
    }

    "return two for a sorted Array containing two unique elements" in {
      val data = Array(1,2)
      RemoveDuplicates.removeDuplicates(data) shouldBe 2
      data.take(2) shouldBe Array(1,2)
    }

    "return two for a sorted Array containing 2 of 3 unique elements" in {
      val data = Array(1,1,2)
      RemoveDuplicates.removeDuplicates(data) shouldBe 2
      data.take(2) shouldBe Array(1,2)
    }

    "return three for a sorted Array containing 3 of 10 unique elements" in {
      val data = Array(1,1,1,2,2,2,2,3,3,3)
      RemoveDuplicates.removeDuplicates(data) shouldBe 3
      data.take(3) shouldBe Array(1,2,3)
    }
  }

}
