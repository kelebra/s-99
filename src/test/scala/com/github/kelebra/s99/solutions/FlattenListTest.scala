package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class FlattenListTest extends WordSpec with PropertyChecks with Matchers {
  "flatten implementation" should {
    "work as .flatten for level 2 nested lists" in {
      forAll { (list: List[List[Int]]) ⇒
        FlattenList(list) shouldBe list.flatten
      }
    }
    "work as .flatten.flatten for level 3 nested lists" in {
      forAll { (list: List[List[List[Int]]]) ⇒
        FlattenList(list) shouldBe list.flatten.flatten
      }
    }
    "work for mix of elements and lists" in {
      val list = List(List(1, 1), 2, List(3, List(5, 8)))
      FlattenList(list) shouldBe List(1, 1, 2, 3, 5, 8)
    }
  }
}
