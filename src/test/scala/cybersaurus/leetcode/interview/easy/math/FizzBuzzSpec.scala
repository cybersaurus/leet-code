package cybersaurus.leetcode.interview.easy.math

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FizzBuzzSpec extends AnyWordSpec with Matchers {
  "FizzBuzz" should {
    "n=0: empty list" in {
      FizzBuzz.fizzBuzz(0) should contain theSameElementsAs List.empty
    }
    "n=1: 1" in {
      FizzBuzz.fizzBuzz(1) should contain theSameElementsAs List("1")
    }
    "n=2: 1,2" in {
      FizzBuzz.fizzBuzz(2) should contain theSameElementsAs List("1", "2")
    }
    "n=3: 1,2,Fizz" in {
      FizzBuzz.fizzBuzz(3) should contain theSameElementsAs List("1", "2","Fizz")
    }
    "n=4: 1,2,Fizz,4" in {
      FizzBuzz.fizzBuzz(4) should contain theSameElementsAs List("1", "2","Fizz","4")
    }
    "n=5: 1,2,Fizz,4,5" in {
      FizzBuzz.fizzBuzz(5) should contain theSameElementsAs List("1", "2","Fizz","4","Buzz")
    }
    "n=6: 1,2,Fizz,4,5,Fizz" in {
      FizzBuzz.fizzBuzz(6) should contain theSameElementsAs List("1", "2","Fizz","4","Buzz","Fizz")
    }
    "n=15: ...,FizzBuzz" in {
      FizzBuzz.fizzBuzz(15) should contain theSameElementsAs List("1", "2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz")
    }
  }
}
