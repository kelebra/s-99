package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

import scala.annotation.tailrec

trait LastElementInList {

  @tailrec
  final def last[T](list: List[T]): T = list match {
    case last :: Nil ⇒ last
    case _ :: tail   ⇒ last(tail)
    case _           ⇒ throw new NoSuchElementException()
  }
}

@Solution(number = 1, input = "1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil")
object LastElementInList extends LastElementInList {

  def apply[T](list: List[T]): T = last(list)
}
