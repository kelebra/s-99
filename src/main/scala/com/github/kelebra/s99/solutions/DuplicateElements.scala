package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

import scala.annotation.tailrec

trait DuplicateElements {

  def duplicate[T](list: List[T]): List[T] = {
    @tailrec def internal(rest: List[T], acc: List[T] = Nil): List[T] =
      rest match {
        case head :: tail ⇒ internal(tail, head :: head :: acc)
        case _            ⇒ acc.reverse
      }

    internal(list)
  }
}

@Solution(number = 14, input = "'a :: 'b :: 'c :: 'c :: 'd :: Nil")
object DuplicateElements extends DuplicateElements {

  def apply[T](list: List[T]): List[T] = duplicate(list)
}