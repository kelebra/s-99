package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.solutions.ReverseList._
import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class ReverseListTest extends WordSpec with PropertyChecks with Matchers {
  "reverse implementation" should {
    "work as .reverse in scala" in {
      forAll { (list: List[Int]) ⇒
        reverse(list) shouldBe list.reverse
      }
    }
  }
}
