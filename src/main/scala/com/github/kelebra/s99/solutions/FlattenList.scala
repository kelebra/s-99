package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution
import com.github.kelebra.s99.problems

@Solution(number = 7, input = "List(List(1, 1), 2, List(3, List(5, 8)))")
trait FlattenList extends problems.FlattenList with ReverseList {

  override def flatten(list: List[Any]): List[Any] =
    list.flatMap {
      case nested: List[_] ⇒ flatten(nested)
      case element         ⇒ List(element)
    }
}
