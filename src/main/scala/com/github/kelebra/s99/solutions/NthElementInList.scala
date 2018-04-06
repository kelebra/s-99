package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution
import com.github.kelebra.s99.problems

import scala.annotation.tailrec

trait NthElementInList extends problems.NthElementInList {

  @tailrec
  final def nth[T](list: List[T], n: Int): T = (list, n) match {
    case (head :: _, 0) ⇒ head
    case (_ :: tail, _) ⇒ nth(tail, n - 1)
    case (Nil, _)       ⇒ throw new NoSuchElementException
  }
}

@Solution(number = 3, input = "1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil, 2")
object NthElementInList extends NthElementInList {

  def apply[T](list: List[T], n: Int): T = nth(list, n)
}