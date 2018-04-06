package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class LengthOfListTest extends WordSpec with PropertyChecks with Matchers {
  "length method implementation" should {
    "work as .length in scala" in {
      forAll { (list: List[Int]) ⇒
        LengthOfList(list) shouldBe list.length
      }
    }
  }
}
