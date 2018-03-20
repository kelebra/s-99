package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.solutions.NthElementInList._
import org.scalacheck.Gen
import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class NthElementInListTest extends WordSpec with PropertyChecks with Matchers {
  private val nonEmptyWithIndex: Gen[(List[Int], Int)] =
    Gen.sized { size ⇒
      for {
        list ← Gen.listOfN(size, Gen.posNum[Int]) if size > 0
        index ← Gen.chooseNum(0, size - 1)
      } yield (list, index)
    }
  "nth method implementation" should {
    "be equivalent to .apply(n) for non-empty lists" in {
      forAll(nonEmptyWithIndex) {
        case (list: List[Int], k: Int) ⇒
          nth(list, k).shouldBe(list(k))
      }
    }
    "throw when list is empty for any n" in {
      forAll { (n: Int) ⇒
        intercept[NoSuchElementException] {
          nth(Nil, n)
        }
      }
    }
  }
}
