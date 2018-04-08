package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

trait RunLengthDecoding {

  def decode[T](list: List[(Int, T)]): List[T] =
    list.flatMap { case (size, element) ⇒ List.fill(size)(element) }
}

@Solution(number = 12, input = "List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))")
object RunLengthDecoding extends RunLengthDecoding {

  def apply[T](list: List[(Int, T)]): List[T] = decode(list)
}