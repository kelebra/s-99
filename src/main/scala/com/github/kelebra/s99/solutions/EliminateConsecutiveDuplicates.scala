package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution
import com.github.kelebra.s99.problems

import scala.annotation.tailrec

trait EliminateConsecutiveDuplicates extends problems.EliminateConsecutiveDuplicates with ReverseList {

  override def compress[T](list: List[T]): List[T] = {
    @tailrec def internal(rest: List[T], duplicate: T, acc: List[T]): List[T] =
      rest match {
        case unique :: tail if unique != duplicate ⇒ internal(tail, unique, unique :: acc)
        case repeat :: tail if repeat == duplicate ⇒ internal(tail, repeat, acc)
        case _                                     ⇒ acc
      }

    list match {
      case head :: tail ⇒ reverse(internal(tail, head, List(head)))
      case _            ⇒ list
    }
  }
}

@Solution(number = 8, input = "List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)")
object EliminateConsecutiveDuplicates extends EliminateConsecutiveDuplicates {

  def apply[T](list: List[T]): List[T] = compress(list)
}