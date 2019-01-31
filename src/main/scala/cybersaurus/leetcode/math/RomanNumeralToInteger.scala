package cybersaurus.leetcode.math

import scala.annotation.tailrec

object RomanNumeralToInteger {
  val symbols = Map(
    'I' -> 1,
    'V' -> 5,
    'X' -> 10,
    'L' -> 50,
    'C' -> 100,
    'D' -> 500,
    'M' -> 1000
  )

  def romanToInt(roman: String): Int = romanToIntFoldLeft(roman.toUpperCase)

  private def romanToIntFoldLeft(roman: String): Int = {
    roman
      .map(symbols)
      .foldLeft((0,0)) { case ((sum, last), cur) =>
        (sum + cur + (if (last < cur) -2*last else 0), cur)
      }._1
  }

  private def romanToIntRecursive(roman: String): Int = {
    def isDescending(l: Char, r: Char) = symbols(l) >= symbols(r)

    @tailrec
    def recurse(sub: String, acc: Int): Int = {
      if (sub.isEmpty) acc
      else if (sub.size == 1) acc + symbols(sub.head)
      else {
        if (isDescending(sub.head, sub.tail.head)) {
          recurse(sub.tail, acc + symbols(sub.head))
        } else {
          recurse(sub.tail.tail, acc + (symbols(sub.tail.head) - symbols(sub.head)))
        }
      }
    }

    recurse(roman, 0)
  }
}
