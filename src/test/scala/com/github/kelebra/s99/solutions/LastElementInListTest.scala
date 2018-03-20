package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.solutions.LastElementInList._
import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class LastElementInListTest extends WordSpec with PropertyChecks with Matchers {

  "last method implementation" should {
    "be equivalent .last for non empty lists" in {
      forAll { (list: List[Int]) ⇒
        whenever(list.nonEmpty) {
          last(list) shouldBe list.last
        }
      }
    }
    "throw same exception for empty list as scala's .last" in {
      intercept[Throwable](last(Nil)).getClass shouldBe intercept[Throwable](Nil.last).getClass
    }
  }
}