package cybersaurus.leetcode.interview.easy.math

import scala.annotation.tailrec

object CountPrimes {
  def countPrimes(n: Int): Int = countPrimesSieveOfEratosthenes(n)

  private def countPrimesSieveOfEratosthenes(n: Int): Int = {
    def markCompositesOf(i: Int, arr: Array[Boolean]): Unit = {
      for (c <- i*2 until n by i) {
        arr.update(c, false)
      }
    }

    val possiblePrimes = Array.fill(n)(true)

    (2 until n).map(markCompositesOf(_, possiblePrimes))

    possiblePrimes.drop(2).filter(identity).size
  }

  private def countPrimesFoldLeft(n: Int): Int = {
    val odds = oddsSmallerThan(n).foldLeft(0) { (acc,cur) =>
      if (isPrime(cur)) acc+1 else acc
    }

    if (n > 2) odds+1 else odds
  }

  private[math] def isPrime(i: Int): Boolean = {
    if (i < 2) false
    else if (i == 2) true
    else (oddsSmallerThan((i+1)/2) :+ 2).find(i % _ == 0).isEmpty
  }

  private def oddsSmallerThan(i: Int): Seq[Int] = {
    def isEven(i: Int) = i % 2 == 0

    (i-1 to 3 by -1).filterNot(isEven)
  }


  private def countPrimesRecursive(n: Int): Int = {
    @tailrec
    def recurse(i: Int, acc: Int): Int = {
      if (i < 2) acc
      else {
        recurse(i-1, if (isPrime(i)) acc+1 else acc )
      }
    }

    recurse(n-1, 0)
  }

}
