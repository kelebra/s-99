package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.problems

import scala.annotation.tailrec

object LengthOfList extends problems.LengthOfList {

  override def length[T](list: List[T]): Int = {
    @tailrec def internal(remaining: List[T], count: Int = 0): Int =
      remaining match {
        case _ :: tail ⇒ internal(tail, count + 1)
        case _         ⇒ count
      }

    internal(list)
  }
}
