package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

import scala.annotation.tailrec
import scala.language.postfixOps

trait SplitListInTwoParts {

  def split[T](list: List[T], at: Int): (List[T], List[T]) = {
    @tailrec def internal(remaining: List[T],
                          first: List[T] = Nil,
                          iteration: Int = 1): (List[T], List[T]) =
      (remaining, iteration) match {
        case (Nil, _)             ⇒ (first.reverse, Nil)
        case (head :: tail, `at`) ⇒ (head :: first reverse, tail)
        case (head :: tail, _)    ⇒ internal(tail, head :: first, iteration + 1)
      }

    if (at < 1 || list.isEmpty) (Nil, list) else internal(list)
  }
}

@Solution(number = 17, input = "List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k), 3")
object SplitListInTwoParts extends SplitListInTwoParts {

  def apply[T](list: List[T], at: Int): (List[T], List[T]) = split(list, at)
}