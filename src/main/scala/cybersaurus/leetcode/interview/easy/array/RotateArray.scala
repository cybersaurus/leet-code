package cybersaurus.leetcode.interview.easy.array

object RotateArray {
  def rotate(nums: Array[Int], k: Int): Unit = rotateArrayPlusPlus(nums, k)

  private def rotateLoop(nums: Array[Int], k: Int): Unit = {
    if (nums.size < 2) ()
    else {
      val kk = k % nums.size

      val wrapping = nums.takeRight(kk)

      val shiftRightFrom = nums.size - kk - 1

      // Shuffle remaining to the right
      for (i <- shiftRightFrom to 0 by -1) {
        nums.update(i + kk, nums(i))
      }

      // Fill shifting from the left
      for (j <- 0 until wrapping.size) {
        nums.update(j, wrapping(j))
      }
    }
  }

  private def rotateFoldLeft(nums: Array[Int], k: Int): Unit = {
    if (nums.size < 2) ()
    else {
      val kk = k % nums.size

      val wrapping = nums.takeRight(kk)

      nums.dropRight(kk).zipWithIndex.foldRight((): Unit) { (cur, acc) =>
        nums.update(cur._2 + kk, cur._1)
      }

      wrapping.zipWithIndex.foldLeft((): Unit) { (acc, cur) =>
        nums.update(cur._2, cur._1)
      }
    }
  }

  private def rotateArrayPlusPlus(nums: Array[Int], k: Int): Unit = {
    if (nums.size < 2) ()
    else {
      val kk = k % nums.size
      (nums.takeRight(kk) ++ nums.take(nums.size - kk)).zipWithIndex.foreach(x => nums.update(x._2, x._1))
    }
  }
}