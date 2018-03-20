package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.problems

import scala.annotation.tailrec

object NthElementInList extends problems.NthElementInList {

  @tailrec
  def nth[T](list: List[T], n: Int): T = (list, n) match {
    case (head :: _, 0) ⇒ head
    case (_ :: tail, _) ⇒ nth(tail, n - 1)
    case (Nil, _)       ⇒ throw new NoSuchElementException
  }
}
