package com.github.kelebra.s99.solutions

import org.scalatest.{Matchers, WordSpec}

class RunLengthEncodingTest extends WordSpec with Matchers {

  "Run length encoding" should {
    "not encode Nil" in {
      RunLengthEncoding(Nil) shouldBe Nil
    }
    "should work for multiple occurrences" in {
      val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      RunLengthEncoding(list) shouldBe List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    }
  }
}
