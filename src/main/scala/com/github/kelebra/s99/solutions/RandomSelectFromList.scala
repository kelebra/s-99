package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

import scala.annotation.tailrec
import scala.util.Random

trait RandomSelectFromList {

  def randomSelect[T](howMany: Int, list: List[T]): List[T] = {
    @tailrec def internal(current  : List[T],
                          length   : Int,
                          remaining: Int,
                          acc      : List[T] = Nil): List[T] =
      RemoveElementInList(Random.nextInt(length), current) match {
        case _ if remaining <= 0 || length < remaining ⇒ acc
        case (_, None)                                 ⇒ acc
        case (result, Some(deleted))                   ⇒
          internal(result, length - 1, remaining - 1, deleted :: acc)
      }

    val length = list.length
    if (howMany <= 0 || howMany >= length) list else internal(list, length, howMany)
  }
}

@Solution(number = 23, input = "3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)")
object RandomSelectFromList extends RandomSelectFromList {

  def apply[T](howMany: Int, list: List[T]): List[T] = randomSelect(howMany, list)
}
