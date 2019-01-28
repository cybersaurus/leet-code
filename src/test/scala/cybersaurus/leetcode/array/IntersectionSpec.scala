package cybersaurus.leetcode.array

import org.scalatest.{Matchers, WordSpec}

class IntersectionSpec extends WordSpec with Matchers {
  "Intersection" should {
    "return empty Array for empty nums1" in {
      Intersection.intersect(Array(), Array(1,2,3)) should contain theSameElementsAs Array[Int]()
    }

    "return empty Array for empty nums2" in {
      Intersection.intersect(Array(1,2,3), Array()) should contain theSameElementsAs Array[Int]()
    }

    "return [2,2]" in {
      Intersection.intersect(Array(1,2,2,1), Array(2,2)) should contain theSameElementsAs Array(2,2)
    }

    "return [4,9]" in {
      Intersection.intersect(Array(4,9,5), Array(9,4,9,8,4)) should contain theSameElementsAs Array(4,9)
    }
  }
}
