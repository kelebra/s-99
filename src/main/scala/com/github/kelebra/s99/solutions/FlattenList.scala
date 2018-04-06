package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution
import com.github.kelebra.s99.problems

trait FlattenList extends problems.FlattenList with ReverseList {

  override def flatten(list: List[Any]): List[Any] =
    list.flatMap {
      case nested: List[_] ⇒ flatten(nested)
      case element         ⇒ List(element)
    }
}

@Solution(number = 7, input = "List(1, 1) :: 2 :: List(3, List(5, 8)) :: Nil")
object FlattenList extends FlattenList {

  def apply(list: List[Any]): List[Any] = flatten(list)
}