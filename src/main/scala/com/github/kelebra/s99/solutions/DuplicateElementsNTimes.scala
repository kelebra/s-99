package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

trait DuplicateElementsNTimes {

  def duplicateN[T](list: List[T], n: Int): List[T] = {
    for {
      element ← list
      _ ← 1 to n
    } yield element
  }
}

@Solution(number = 15, input = "'a :: 'b :: 'c :: 'c :: 'd :: Nil, 3")
object DuplicateElementsNTimes extends DuplicateElementsNTimes {

  def apply[T](list: List[T], times: Int): List[T] = duplicateN(list, times)
}