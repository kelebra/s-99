package com.github.kelebra.s99.solutions

import org.scalacheck.Gen
import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class EliminateConsecutiveDuplicatesTest extends WordSpec with PropertyChecks with Matchers {

  "Consecutive duplicated elimination" should {

    "return single element" in {
      forAll(Gen.choose(0, 100)) { (times: Int) ⇒
        val singleCharacterList = (1 to times).map(_ ⇒ 'a).toList
        EliminateConsecutiveDuplicates(singleCharacterList) shouldBe singleCharacterList.distinct
      }
    }

    "work as fold right solution" in {
      forAll { (list: List[Int]) ⇒
        EliminateConsecutiveDuplicates(list) shouldBe
          list.foldRight(List.empty[Int]) {
            (h, r) => if (r.isEmpty || r.head != h) h :: r else r
          }
      }
    }
  }
}
