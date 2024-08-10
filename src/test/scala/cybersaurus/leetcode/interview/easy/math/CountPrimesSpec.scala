package cybersaurus.leetcode.interview.easy.math

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CountPrimesSpec extends AnyWordSpec with Matchers {
  "CountPrimes" should {
    "0 primes for input 0" in {
      CountPrimes.countPrimes(0) shouldBe 0
    }

    "0 primes for input 1" in {
      CountPrimes.countPrimes(1) shouldBe 0
    }

    "0 primes for input 2" in {
      CountPrimes.countPrimes(2) shouldBe 0
    }

    "1 primes for input 3" in {
      CountPrimes.countPrimes(3) shouldBe 1
    }

    "4 primes for input 10" in {
      CountPrimes.countPrimes(10) shouldBe 4
    }

    "8 primes for input 20" in {
      CountPrimes.countPrimes(20) shouldBe 8
    }

    "25 primes for input 20" in {
      CountPrimes.countPrimes(100) shouldBe 25
    }

    "2 is prime" in {
      CountPrimes.isPrime(2) shouldBe true
    }

    "3 is prime" in {
      CountPrimes.isPrime(3) shouldBe true
    }

    "4 is not prime" in {
      CountPrimes.isPrime(4) shouldBe false
    }
  }

}
