package cybersaurus.leetcode.interview.easy.array

import scala.annotation.tailrec

case object PlusOne {
  def plusOne(digits: Array[Int]): Array[Int] = {
    @tailrec def plusOneRecursive(acc: Array[Int], currentIndex: Int): Array[Int] = {
      val endOfArray: Boolean = acc.size == currentIndex

      if endOfArray then {
        val newArray = Array.copyOf(acc, acc.size + 1)
        newArray.update(currentIndex, 1)
        newArray
      } else {
        val currentElement = acc(currentIndex)

        if currentElement <= 8 then
          val newArray = Array.copyOf(acc, acc.size + 1)
          acc.update(currentIndex, currentElement + 1)
          acc
        else {
          acc.update(currentIndex, 0)
          plusOneRecursive(acc, currentIndex + 1)
        }
      }
    }

    if digits.isEmpty then digits else plusOneRecursive(digits.reverse, 0).reverse
  }
}
