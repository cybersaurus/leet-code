package cybersaurus.leetcode.interview.easy.sorting

import scala.annotation.tailrec

object MergeSorted {
  @tailrec
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    if (n == 0) ()
    else {
      val indexOfFirstElementToMoveRight = nums1.indexWhere(e1 => e1 > nums2.head)

      val insertionIndex = if (indexOfFirstElementToMoveRight == -1) m else indexOfFirstElementToMoveRight

      // Shuffle each number right be 1 place.
      for (i <- m until insertionIndex by -1) {
        nums1.update(i, nums1(i-1))
      }

      // Insert new element
      nums1.update(insertionIndex, nums2.head)

      merge(nums1, m+1, nums2.tail, n-1)
    }
  }
}
