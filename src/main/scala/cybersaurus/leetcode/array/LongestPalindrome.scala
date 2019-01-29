package cybersaurus.leetcode.array


object LongestPalindrome {
  def longestPalindrome(s: String): String = longestPalindromeDoubleForLoops(s)

  private def longestPalindromeDoubleForLoops(s: String): String = {

    var acc = ""

    for (l <- 0 until s.size) {
      for (r <- s.size until l by -1) {
        val sub = s.substring(l, r)

        val (left, mid, right) =
          if (sub.size % 2 == 0) {
            (sub.substring(0, sub.size / 2), None, sub.substring(sub.size / 2, sub.size))
          } else {
            (sub.substring(0, sub.size / 2), Some(sub(sub.size/2)), sub.substring((sub.size / 2)+1, sub.size))
          }

        val targetSize = left.size + mid.size + right.size

        if ((left == right.reverse) && (targetSize > acc.length)) {
          acc = left ++ mid ++ right
        }
      }
    }

    acc
  }

  private def longestPalindromeDoubleRecurse(s: String): String = {

    def recurse(sub: String, acc: String): String = {
      if ((sub.isEmpty) || (acc.size >= sub.size)) acc
      else {
        val (left, mid, right) =
          if (sub.size % 2 == 0) {
            (sub.substring(0, sub.size / 2), None, sub.substring(sub.size / 2, sub.size))
          } else {
            (sub.substring(0, sub.size / 2), Some(sub(sub.size/2)), sub.substring((sub.size / 2)+1, sub.size))
          }

        val target = left ++ mid ++ right

        if ((left == right.reverse) && (target.length > acc.length)) {
          recurse(sub.tail, target)
        } else {
          recurse(sub.tail, recurse(sub.dropRight(1), acc))
        }
      }
    }

    recurse(s, "")
  }
}
