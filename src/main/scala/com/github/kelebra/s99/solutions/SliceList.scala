package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

import scala.annotation.tailrec

trait SliceList {

  def slice[T](from: Int, to: Int, list: List[T]): List[T] = {
    def withinRange(i: Int): Boolean = i >= from && i < to

    @tailrec def internal(remaining: List[T],
                          i        : Int = 0,
                          acc      : List[T] = Nil): List[T] =
      (remaining, i) match {
        case (head :: tail, _) if withinRange(i) ⇒ internal(tail, i + 1, head :: acc)
        case (_, `to`)                           ⇒ acc.reverse
        case (_ :: tail, _)                      ⇒ internal(tail, i + 1, acc)
        case _                                   ⇒ list
      }

    internal(list)
  }
}

@Solution(number = 18, input = "3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)")
object SliceList extends SliceList {

  def apply[T](from: Int, to: Int, list: List[T]): List[T] = slice(from, to, list)
}