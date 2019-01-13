package cybersaurus.leetcode.array

import org.scalatest.{Matchers, WordSpec}

class RotateArraySpec extends WordSpec with Matchers {
  "RotateArray" should {
    "return an empty array unmodified" in {
      val data = Array[Int]()
      RotateArray.rotate(data, 0)
      data shouldBe Array()
    }

    "return a single element array unmodified" in {
      val data = Array(1)
      RotateArray.rotate(data, 0)
      data shouldBe Array(1)
    }

    "return a two element array unchanged" in {
      val data = Array(1,2)
      RotateArray.rotate(data, 0)
      data shouldBe Array(1,2)
    }

    "return a two element array reversed" in {
      val data = Array(1,2)
      RotateArray.rotate(data, 1)
      data shouldBe Array(2,1)
    }

    "return [1,2] when k is 3" in {
      val data = Array(1,2)
      RotateArray.rotate(data, 3)
      data shouldBe Array(2,1)
    }

    "return [5,6,7,1,2,3,4]" in {
      val data = Array(1,2,3,4,5,6,7)
      RotateArray.rotate(data, 3)
      data shouldBe Array(5,6,7,1,2,3,4)
    }
  }
}
