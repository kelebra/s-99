package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.problems

trait FlattenList extends problems.FlattenList with ReverseList {

  override def flatten(list: List[Any]): List[Any] =
    list.flatMap {
      case nested: List[_] ⇒ flatten(nested)
      case element         ⇒ List(element)
    }
}
