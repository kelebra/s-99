package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.solutions.PenultimateElementInList.penultimate
import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class PenultimateElementInListTest extends WordSpec with PropertyChecks with Matchers {

  "penultimate method implementation" should {
    "work like like init.last in scala" in {
      forAll { (list: List[Int]) ⇒
        whenever(list.size >= 2) {
          penultimate(list) shouldBe list.init.last
        }
      }
    }
    "throw exception for empty list" in {
      intercept[NoSuchElementException](penultimate(Nil))
    }
    "throw exception for single element list" in {
      intercept[NoSuchElementException](penultimate(List(1)))
    }
  }
}
