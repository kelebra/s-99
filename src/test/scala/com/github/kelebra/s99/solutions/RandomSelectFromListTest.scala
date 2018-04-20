package com.github.kelebra.s99.solutions

import org.scalatest.{Matchers, WordSpec}

class RandomSelectFromListTest extends WordSpec with Matchers {

  "Random element selection" should {
    "return elements from list" in {
      val original = (1 to 100).toList
      val randomSelection = RandomSelectFromList(10, original)
      randomSelection.forall{original.contains} shouldBe true
    }
    "return incoming list" in {
      val nonEmpty = List(1, 2, 3)
      RandomSelectFromList(10, Nil) shouldBe Nil
      RandomSelectFromList(-1, Nil) shouldBe Nil
      RandomSelectFromList(-1, nonEmpty) shouldBe nonEmpty
      RandomSelectFromList(100, nonEmpty) shouldBe nonEmpty
    }
  }
}
