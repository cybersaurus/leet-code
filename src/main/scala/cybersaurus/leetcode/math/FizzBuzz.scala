package cybersaurus.leetcode.math

import scala.annotation.tailrec

object FizzBuzz {
  def fizzBuzz(n: Int): List[String] = fizzBuzzLoop(n)

  private def fizzBuzzLoop(n: Int): List[String] = {
    (1 to n).toList map { i =>
      if (i % 15 == 0) "FizzBuzz"
      else if (i % 3 == 0) "Fizz"
      else if (i % 5 == 0) "Buzz"
      else i.toString
    }
  }

  private def fizzBuzzTailRecursive(n: Int): List[String] = {
    @tailrec
    def recurse(n: Int, acc: List[String]): List[String] = {
      if (n == 0) return acc
      else {
        val current =
          if (n % 15 == 0) "FizzBuzz"
          else if (n % 3 == 0) "Fizz"
          else if (n % 5 == 0) "Buzz"
          else n.toString

        recurse(n-1, current :: acc)
      }
    }

    recurse(n, List.empty)
  }

  private def fizzBuzzRecursive(n: Int): List[String] = {
    if (n == 0) return List.empty
    else {
      val current =
        if (n % 15 == 0) "FizzBuzz"
        else if (n % 3 == 0) "Fizz"
        else if (n % 5 == 0) "Buzz"
        else n.toString

      fizzBuzz(n-1) :+ current
    }
  }
}
