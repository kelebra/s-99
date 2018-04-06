package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution
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

@Solution(number = 2, input = "1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil")
object PenultimateElementInList extends PenultimateElementInList {

  def apply[T](list: List[T]): T = penultimate(list)
}