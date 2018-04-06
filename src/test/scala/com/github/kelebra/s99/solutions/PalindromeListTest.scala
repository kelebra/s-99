package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class PalindromeListTest extends WordSpec with PropertyChecks with Matchers {
  "is palindrome implementation" should {
    "work as list == list.reverse in scala" in {
      forAll { (list: List[Int]) ⇒
        PalindromeList(list) shouldBe (list.reverse == list)
      }
    }
    "work for palindrome example of odd length" in {
      PalindromeList("madam".toList) should be(true)
    }
    "work for palindrome example of even length" in {
      PalindromeList("anna".toList) should be(true)
    }
  }
}
