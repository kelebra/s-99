package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

import scala.annotation.tailrec

trait RotateListLeft {

  def rotate[T](places: Int, list: List[T]): List[T] = {
    @tailrec def internal(remaining: List[T],
                          target: Int,
                          left: List[T] = Nil): List[T] =
      (remaining, target) match {
        case (head :: tail, 1) ⇒ tail ::: (head :: left).reverse
        case (head :: tail, _) ⇒ internal(tail, target - 1, head :: left)
        case _                 ⇒ list
      }

    if (places == 0) list
    else internal(list, (places + list.length) % list.length)
  }
}

@Solution(number = 19, input = "3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)")
object RotateListLeft extends RotateListLeft {

  def apply[T](places: Int, list: List[T]): List[T] = rotate(places, list)
}