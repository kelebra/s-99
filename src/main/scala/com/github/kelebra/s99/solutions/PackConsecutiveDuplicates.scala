package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution
import com.github.kelebra.s99.problems

import scala.annotation.tailrec

trait PackConsecutiveDuplicates extends problems.PackConsecutiveDuplicates {

  override def pack[T](list: List[T]): List[List[T]] = {
    @tailrec def internal(rest: List[T],
                          group: List[T] = Nil,
                          acc  : List[List[T]] = Nil): List[List[T]] =
      rest match {
        case Nil if group.isEmpty                                             ⇒ Nil
        case in :: tail if group.isEmpty || group.headOption.contains(in)     ⇒ internal(tail, in :: group, acc)
        case out :: tail if group.nonEmpty && !group.headOption.contains(out) ⇒ internal(tail, out :: Nil, group :: acc)
        case _                                                                ⇒ (group :: acc).reverse
      }

    internal(list)
  }
}

@Solution(number = 9, input = "List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)")
object PackConsecutiveDuplicates extends PackConsecutiveDuplicates {

  def apply[T](list: List[T]): List[List[T]] = pack(list)
}