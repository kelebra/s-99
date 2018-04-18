package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class InsertElementInListTest extends WordSpec with PropertyChecks with Matchers {

  "Insertion of element into list" should {
    "work as splitAt _1 ::: _2" in {
      forAll { (list: List[Int]) ⇒
        val element = -250
        val middle = list.length / 2
        val expected = list.splitAt(middle) match {
          case (left, right) ⇒ left ::: List(element) ::: right
        }
        InsertElementInList(element, middle, list) shouldBe expected
      }
    }
    "return Nil" in {
      val element = -250
      InsertElementInList(element, 1, Nil) shouldBe Nil
    }
    "return same list" in {
      InsertElementInList(1, -1, Nil) shouldBe Nil
    }
    "insert to head of list" in {
      val element = 1
      val nonEmpty = List(1, 2, 3)
      InsertElementInList(element, 0, nonEmpty) shouldBe element :: nonEmpty
    }
    "insert to tail of list" in {
      val element = 1
      val nonEmpty = List(1, 2, 3)
      InsertElementInList(element, nonEmpty.length, nonEmpty) shouldBe
        nonEmpty ::: List(element)
    }
  }
}
