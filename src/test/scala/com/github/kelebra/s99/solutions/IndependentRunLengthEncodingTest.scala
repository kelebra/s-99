package com.github.kelebra.s99.solutions

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class IndependentRunLengthEncodingTest extends WordSpec with PropertyChecks with Matchers {

  "Independent run length encoding" should {
    "work as run length encoding via pack" in {
      forAll { (list: List[Int]) ⇒
        IndependentRunLengthEncoding(list) shouldBe RunLengthEncoding(list)
      }
    }
    "work in encode decode cycle" in {
      forAll { (list: List[Int]) ⇒
        RunLengthDecoding(IndependentRunLengthEncoding(list)) shouldBe list
      }
    }
  }
}
