package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution
import com.github.kelebra.s99.problems

import scala.annotation.tailrec

@Solution(number = 4, input = "List(1, 1, 2, 3, 5, 8)")
trait LengthOfList extends problems.LengthOfList {

  final def length[T](list: List[T]): Int = {
    @tailrec def internal(remaining: List[T], count: Int = 0): Int =
      remaining match {
        case _ :: tail ⇒ internal(tail, count + 1)
        case _         ⇒ count
      }

    internal(list)
  }
}
