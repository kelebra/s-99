package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.problems

import scala.annotation.tailrec

object ReverseList extends problems.ReverseList {

  override def reverse[T](list: List[T]): List[T] = {
    @tailrec def internal(remaining: List[T], reversed: List[T] = Nil): List[T] =
      remaining match {
        case head :: tail ⇒ internal(tail, head :: reversed)
        case _            ⇒ reversed
      }

    internal(list)
  }
}
