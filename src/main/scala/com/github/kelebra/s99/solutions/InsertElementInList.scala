package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

import scala.annotation.tailrec

trait InsertElementInList {

  def insertAt[T](element: T, at: Int, list: List[T]): List[T] = {
    @tailrec def internal(remaining: List[T],
                          i: Int = at,
                          acc: List[T] = Nil): List[T] =
      (remaining, i) match {
        case (head :: tail, 0) ⇒ (head :: element :: acc).reverse ::: tail
        case (Nil, 0)          ⇒ (element :: acc).reverse
        case (head :: tail, _) ⇒ internal(tail, i - 1, head :: acc)
        case _                 ⇒ acc.reverse
      }

    (list, at) match {
      case (Nil, _)                      ⇒ element :: Nil
      case (_, negative) if negative < 0 ⇒ list
      case _                             ⇒ internal(list)
    }
  }
}

@Solution(number = 21, input = "'new, 1, List('a, 'b, 'c, 'd)")
object InsertElementInList extends InsertElementInList {

  def apply[T](element: T, at: Int, list: List[T]): List[T] = insertAt(element, at, list)
}