package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

import scala.annotation.tailrec
import scala.language.postfixOps

trait IndependentRunLengthEncoding {

  def encode[T](list: List[T]): List[(Int, T)] = {
    @tailrec def internal(remaining: List[T],
                          current  : T,
                          size: Int = 1,
                          acc      : List[(Int, T)] = Nil): List[(Int, T)] =
      remaining match {
        case in :: tail if in == current   ⇒ internal(tail, in, size + 1, acc)
        case out :: tail if out != current ⇒ internal(tail, out, 1, (size, current) :: acc)
        case _                             ⇒ (size, current) :: acc reverse
      }

    list match {
      case head :: tail ⇒ internal(tail, head)
      case _            ⇒ Nil
    }
  }
}

@Solution(number = 13, input = "List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)")
object IndependentRunLengthEncoding extends IndependentRunLengthEncoding {

  def apply[T](list: List[T]): List[(Int, T)] = encode(list)
}