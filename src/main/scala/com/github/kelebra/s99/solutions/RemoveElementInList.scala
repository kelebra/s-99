package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

import scala.annotation.tailrec

trait RemoveElementInList {

  def removeAt[T](position: Int, list: List[T]): List[T] = {
    @tailrec def internal(remaining: List[T],
                          acc      : List[T] = Nil,
                          i        : Int = position): List[T] =
      (remaining, i) match {
        case (_ :: tail, 1)    ⇒ acc.reverse ::: tail
        case (head :: tail, _) ⇒ internal(tail, head :: acc, i - 1)
        case _                 ⇒ acc.reverse
      }

    if (position < 1 || list.isEmpty) list else internal(list)
  }
}

@Solution(number = 20, input = "1, List('a, 'b, 'c, 'd)")
object RemoveElementInList extends RemoveElementInList {

  def apply[T](position: Int, list: List[T]): List[T] = removeAt(position, list)
}