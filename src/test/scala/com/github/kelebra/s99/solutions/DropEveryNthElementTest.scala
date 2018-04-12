package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class DropEveryNthElementTest extends WordSpec with PropertyChecks with Matchers {

  "Drop every nth element" should {
    "work as zipWithIndex and flatMap" in {
      forAll { (list: List[Int]) ⇒
        val n = 3
        DropEveryNthElement(list, n) shouldBe list.zipWithIndex
          .flatMap {
            case (s, index) if (index + 1) % n != 0 ⇒ s :: Nil
            case _                                  ⇒ Nil
          }
      }
    }
    "not change elements for n < 0" in {
      forAll { (list: List[Int]) ⇒
        DropEveryNthElement(list, -1) shouldBe list
      }
    }
    "not change elements for n = 0" in {
      forAll { (list: List[Int]) ⇒
        DropEveryNthElement(list, 0) shouldBe list
      }
    }
    "drop all elements for n = 1" in {
      forAll { (list: List[Int]) ⇒
        DropEveryNthElement(list, 1) shouldBe Nil
      }
    }
  }
}
