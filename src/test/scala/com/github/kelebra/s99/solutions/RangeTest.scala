package com.github.kelebra.s99.solutions

import org.scalacheck.Gen
import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class RangeTest extends WordSpec with PropertyChecks with Matchers {

  "Range generation" should {
    "work as to implicit for valid values" in {
      forAll(Gen.chooseNum(1, 2), Gen.chooseNum(4, 7)) { (from: Int, to: Int) ⇒
        Range(from, to) shouldBe (from to to).toList
      }
    }
    "return Nil for invalid input" in {
      Range(-1, -5) shouldBe Nil
      Range(5, 1) shouldBe Nil
    }
  }
}
