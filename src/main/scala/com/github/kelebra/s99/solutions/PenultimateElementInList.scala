package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.problems

import scala.annotation.tailrec

trait PenultimateElementInList extends problems.PenultimateElementInList {

  @tailrec
  final def penultimate[T](list: List[T]): T = list match {
    case head :: _ :: Nil ⇒ head
    case _ :: tail        ⇒ penultimate(tail)
    case _                ⇒ throw new NoSuchElementException()
  }
}
