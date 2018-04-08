package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

trait RunLengthEncoding extends PackConsecutiveDuplicates {

  def encode[T](list: List[T]): List[(Int, T)] =
    pack(list).map(group ⇒ (group.length, group.head))
}

@Solution(number = 10, input = "List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)")
object RunLengthEncoding extends RunLengthEncoding {

  def apply[T](list: List[T]): List[(Int, T)] = encode(list)
}
