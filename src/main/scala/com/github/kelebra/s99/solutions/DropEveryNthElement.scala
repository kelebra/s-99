package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

import scala.annotation.tailrec

trait DropEveryNthElement {

  def drop[T](list: List[T], n: Int): List[T] = {
    @tailrec def internal(remaining: List[T],
                          iteration: Int = 1,
                          acc      : List[T] = Nil): List[T] = {
      val next = (iteration + 1) % n
      remaining match {
        case include :: tail if iteration % n != 0 ⇒ internal(tail, next, include :: acc)
        case _ :: tail                             ⇒ internal(tail, next, acc)
        case Nil                                   ⇒ acc.reverse
      }
    }

    n match {
      case invalid if invalid <= 0 ⇒ list
      case _                       ⇒ internal(list)
    }
  }
}

@Solution(number = 16, input = "List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k), 3")
object DropEveryNthElement extends DropEveryNthElement {

  def apply[T](list: List[T], n: Int): List[T] = drop(list, n)
}
