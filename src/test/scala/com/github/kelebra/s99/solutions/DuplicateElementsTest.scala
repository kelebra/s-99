package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class DuplicateElementsTest extends WordSpec with PropertyChecks with Matchers {

  "Elements duplication in list" should {
    "work as flatMap and fill" in {
      forAll { (list: List[Int]) ⇒
        DuplicateElements(list) shouldBe list.flatMap(List.fill(2)(_))
      }
    }
  }
}
