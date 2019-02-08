package cybersaurus.leetcode.interview.easy.sorting

import org.scalatest.{Matchers, WordSpec}

class MergeSortedSpec extends WordSpec with Matchers {
  "MergeSorted" should {
    "merge an empty Array" in {
      val target = Array(1,2,3)
      MergeSorted.merge(target, 3, Array(), 0)
      target should contain theSameElementsAs Array(1,2,3)
    }

    "merge into an empty Array" in {
      val target = Array(0,0,0)
      MergeSorted.merge(target, 0, Array(1,2,3), 3)
      target should contain theSameElementsAs Array(1,2,3)
    }

    "merge a single element Array" in {
      val target = Array(1,2,4,0)
      MergeSorted.merge(target, 3, Array(3), 1)
      target should contain theSameElementsAs Array(1,2,3,4)
    }

    "merge a two element Array" in {
      val target = Array(1,2,4,0,0)
      MergeSorted.merge(target, 3, Array(3,5), 2)
      target should contain theSameElementsAs Array(1,2,3,4,5)
    }
  }
}
