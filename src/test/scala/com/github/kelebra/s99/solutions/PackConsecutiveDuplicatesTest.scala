package com.github.kelebra.s99.solutions

import org.scalatest.{Matchers, WordSpec}

class PackConsecutiveDuplicatesTest extends WordSpec with Matchers {

  "Pack of consecutive duplicates" should {
    "return empty list" in {
      PackConsecutiveDuplicates(Nil) shouldBe Nil
    }
    "return single list of elements" in {
      PackConsecutiveDuplicates(List('a, 'a, 'a)) shouldBe List(List('a, 'a, 'a))
    }
    "work for mixed example" in {
      val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      PackConsecutiveDuplicates(list) shouldBe
        List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    }
  }
}
