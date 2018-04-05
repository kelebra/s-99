package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class PalindromeListTest extends WordSpec with PropertyChecks with Matchers with PalindromeList {
  "is palindrome implementation" should {
    "work as list == list.reverse in scala" in {
      forAll { (list: List[Int]) ⇒
        isPalindrome(list) shouldBe (list.reverse == list)
      }
    }
    "work for palindrome example of odd length" in {
      isPalindrome("madam".toList) should be(true)
    }
    "work for palindrome example of even length" in {
      isPalindrome("anna".toList) should be(true)
    }
  }
}
