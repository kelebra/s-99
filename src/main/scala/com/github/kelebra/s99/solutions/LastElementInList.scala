package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.problems

import scala.annotation.tailrec

object LastElementInList extends problems.LastElementInList {

  @tailrec
  override def last[T](list: List[T]): T = list match {
    case last :: Nil ⇒ last
    case _ :: tail   ⇒ last(tail)
    case _           ⇒ throw new NoSuchElementException()
  }
}
