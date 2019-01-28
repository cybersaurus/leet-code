package cybersaurus.leetcode.array

import scala.annotation.tailrec

object Intersection {
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {

    @tailrec
    def recurse(nums1: Array[Int], nums2: Array[Int], acc: Array[Int]): Array[Int] = {
      if (nums1.isEmpty || nums2.isEmpty) acc
      else {
        val index = nums2.indexWhere(e2 => nums1.head == e2)

        if (index == -1) {
          recurse(nums1.tail, nums2, acc)
        } else {
          recurse(nums1.tail, nums2.slice(0, index) ++ nums2.slice(index + 1, nums2.size), acc :+ nums1.head)
        }
      }
    }

    recurse(nums1, nums2, Array())
  }
}
