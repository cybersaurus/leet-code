package cybersaurus.leetcode.interview.easy.array

object SingleNumber {
  def singleNumber(nums: Array[Int]): Int = singleNumberGroupBy(nums)

  private def singleNumberGroupBy(nums: Array[Int]): Int = {
    nums.groupBy(identity)
      .find(_._2.size == 1)
      .get
      ._1
  }

  // https://www.scala-lang.org/api/current/scala/Byte.html#^(x:Int):Int
  private def singleNumberReduceBitwiseXOR(nums: Array[Int]): Int = nums.reduce(_ ^ _)
}
