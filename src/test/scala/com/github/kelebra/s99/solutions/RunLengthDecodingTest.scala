package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class RunLengthDecodingTest extends WordSpec with PropertyChecks with Matchers {

  "Run length decoding" should {
    "decode list every encoded list" in {
      forAll { (list: List[Int]) ⇒
        RunLengthDecoding(RunLengthEncoding(list)) shouldBe list
      }
    }
  }
}
