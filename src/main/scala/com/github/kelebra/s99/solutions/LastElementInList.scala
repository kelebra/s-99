package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution
import com.github.kelebra.s99.problems

import scala.annotation.tailrec

@Solution(number = 1, input = "List(1, 1, 2, 3, 5, 8)")
trait LastElementInList extends problems.LastElementInList {

  @tailrec
  final def last[T](list: List[T]): T = list match {
    case last :: Nil ⇒ last
    case _ :: tail   ⇒ last(tail)
    case _           ⇒ throw new NoSuchElementException()
  }
}
