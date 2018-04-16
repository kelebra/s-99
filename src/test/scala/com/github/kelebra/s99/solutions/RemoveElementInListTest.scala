package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class RemoveElementInListTest extends WordSpec with PropertyChecks with Matchers {

  "Remove element" should {
    "work as take ::: take" in {
      forAll { (list: List[Int]) ⇒
        val middle = list.length / 2
        val expected = list.take(middle) ::: list.takeRight(list.length - middle - 1)
        RemoveElementInList(middle, list) shouldBe expected
      }
    }
    "sanely work for exceeding position" in {
      val nonEmpty = List(1, 2, 3)
      RemoveElementInList(100, nonEmpty) shouldBe nonEmpty
    }
  }
}
