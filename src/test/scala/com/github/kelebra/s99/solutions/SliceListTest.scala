package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class SliceListTest extends WordSpec with PropertyChecks with Matchers {

  "Slice" should {
    "provide first part of list" in {
      forAll { (list: List[Int]) ⇒
        val from = 0
        val to = list.length / 2
        SliceList(from, to, list) shouldBe list.slice(from, to)
      }
    }
    "provide second part of list" in {
      forAll { (list: List[Int]) ⇒
        val from = list.length / 2
        val to = list.length
        SliceList(from, to, list) shouldBe list.slice(from, to)
      }
    }
    "work for empty list" in {
      val nonEmpty = List(0, 1, 2)
      SliceList(10, 20, Nil) shouldBe Nil
      SliceList(-1, 10, Nil) shouldBe Nil
      SliceList(-1, 10, nonEmpty) shouldBe nonEmpty
    }
  }
}
