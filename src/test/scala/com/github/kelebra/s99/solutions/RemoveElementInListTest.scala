package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class RemoveElementInListTest extends WordSpec with PropertyChecks with Matchers {

  "Remove element" should {
    "work as take ::: take" in {
      forAll { (list: List[Int]) ⇒
        val middle = list.length / 2
        val expected = list.take(middle - 1) ::: list.takeRight(list.length - middle)
        RemoveElementInList(middle, list) shouldBe expected
      }
    }
  }
}
