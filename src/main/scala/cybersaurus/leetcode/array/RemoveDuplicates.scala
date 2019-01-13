package cybersaurus.leetcode.array

import scala.annotation.tailrec

object RemoveDuplicates {
  def removeDuplicates(nums: Array[Int]): Int = removeDuplicatesRecursive(nums)

  private def removeDuplicatesFoldLeft(nums: Array[Int]): Int = {
    if (nums.size < 2) nums.size
    else {
      val empty = (1, nums.head, 1) // count, last, updateIndex

      nums.zipWithIndex.tail.foldLeft(empty) { (acc, cur) =>
        if (cur._1 == nums(cur._2-1)) {
          acc
        }
        else {
          nums.update(acc._3, cur._1)
          (acc._1+1, cur._1, acc._3+1)
        }
      }._1
    }
  }

  private def removeDuplicatesRecursive(nums: Array[Int]): Int = {
    @tailrec
    def removeDuplicatesRecursiveHelper(acc: Int, currentIndex: Int, updateIndex: Int): Int = {
      if (nums.size - currentIndex == 0) acc
      else {
        val (newAcc, newUpdIndex) = if (nums(currentIndex) > nums(currentIndex-1)) {
          nums.update(updateIndex, nums(currentIndex))
          (acc+1,updateIndex+1)
        } else {
          (acc,updateIndex)
        }
        removeDuplicatesRecursiveHelper(newAcc, currentIndex+1, newUpdIndex)
      }
    }

    if (nums.size < 2) nums.size
    else
      removeDuplicatesRecursiveHelper(1, 1, 1)
  }
}