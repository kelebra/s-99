package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

import scala.annotation.tailrec

trait Range {

  def range(from: Int, to: Int): List[Int] = {
    @tailrec def internal(current: Int,
                          acc    : List[Int] = Nil): List[Int] =
      if (current < from) acc
      else internal(current - 1, current :: acc)

    if (to < from) Nil else internal(to)
  }
}

@Solution(number = 22, input = "4, 9")
object Range extends Range {

  def apply(from: Int, to: Int): List[Int] = range(from, to)
}