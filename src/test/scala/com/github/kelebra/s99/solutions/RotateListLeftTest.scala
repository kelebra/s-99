package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class RotateListLeftTest extends WordSpec with PropertyChecks with Matchers {

  "Rotate list left" should {
    "work as drop ::: take" in {
      forAll { (list: List[Int]) ⇒
        val places = list.length / 2
        RotateListLeft(places, list) shouldBe list.drop(places) ::: list.take(places)
      }
    }
    "apply modulo for positions" in {
      RotateListLeft(-1, List(1, 2, 3, 4)) shouldBe List(4, 1, 2, 3)
      RotateListLeft(9, List(1, 2, 3, 4)) shouldBe List(2, 3, 4, 1)
    }
  }
}
