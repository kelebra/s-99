package com.github.kelebra.s99.solutions

import org.scalatest.{Matchers, WordSpec}

class FlatRunLengthEncodingTest extends WordSpec with Matchers {

  "Flat run length encoding" should {
    "work like run length encoding" in {
      val list = List('a, 'a, 'a, 'a, 'c, 'c, 'a, 'a, 'e, 'e, 'e, 'e)
      FlatRunLengthEncoding(list) shouldBe RunLengthEncoding(list).map(Right.apply)
    }
    "flat single elements" in {
      val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      FlatRunLengthEncoding(list) shouldBe
        List(Right(4 → 'a), Left('b), Right(2 → 'c), Right(2 → 'a), Left('d), Right(4 → 'e))
    }
  }
}
