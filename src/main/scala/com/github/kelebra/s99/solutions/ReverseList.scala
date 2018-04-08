package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

import scala.annotation.tailrec

trait ReverseList {

  def reverse[T](list: List[T]): List[T] = {
    @tailrec def internal(remaining: List[T], reversed: List[T] = Nil): List[T] =
      remaining match {
        case head :: tail ⇒ internal(tail, head :: reversed)
        case _            ⇒ reversed
      }

    internal(list)
  }
}

@Solution(number = 5, input = "1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil")
object ReverseList extends ReverseList {

  def apply[T](list: List[T]): List[T] = reverse(list)
}