package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.problems

import scala.annotation.tailrec

object PenultimateElementInList extends problems.PenultimateElementInList {

  @tailrec
  override def penultimate[T](list: List[T]): T = list match {
    case head :: _ :: Nil ⇒ head
    case _ :: tail        ⇒ penultimate(tail)
    case _                ⇒ throw new NoSuchElementException()
  }
}
