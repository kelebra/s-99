package com.github.kelebra.s99.solutions

import org.scalatest.{Matchers, WordSpec}
import org.scalatest.prop.PropertyChecks

import PalindromeList._

class PalindromeListTest extends WordSpec with PropertyChecks with Matchers {
  "is palindrome implementation" should {
    "work as list == list.reverse in scala" in {
      forAll { (list: List[Int]) ⇒
        isPalindrome(list) shouldBe (list.reverse == list)
      }
    }
  }
}
