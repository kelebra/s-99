package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class DuplicateElementsNTimesTest extends WordSpec with PropertyChecks with Matchers {

  "Duplicate N times" should {
    "work like duplicate for n = 2" in {
      forAll { (list: List[Int]) ⇒
        DuplicateElementsNTimes(list, 2) shouldBe DuplicateElements(list)
      }
    }
    "work like flatMap and fill" in {
      forAll { (list: List[Int]) ⇒
        val times = 5
        DuplicateElementsNTimes(list, times) shouldBe list.flatMap(List.fill(times)(_))
      }
    }
  }
}
