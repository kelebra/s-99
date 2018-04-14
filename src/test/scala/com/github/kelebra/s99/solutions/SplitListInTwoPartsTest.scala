package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class SplitListInTwoPartsTest extends WordSpec with PropertyChecks with Matchers {

  "List split at" should {
    "work as splitAt" in {
      forAll { (list: List[Int]) ⇒
        val at = list.length / 2
        SplitListInTwoParts(list, at) shouldBe list.splitAt(at)
      }
    }
    "be adequate for invalid input" in {
      val nonEmpty = List(1, 2, 3)
      val empty = (Nil, Nil)
      SplitListInTwoParts(Nil, -1) shouldBe empty
      SplitListInTwoParts(Nil, 100) shouldBe empty
      SplitListInTwoParts(nonEmpty, -1) shouldBe(Nil, nonEmpty)
      SplitListInTwoParts(nonEmpty, 1000) shouldBe(nonEmpty, Nil)
    }
  }
}
