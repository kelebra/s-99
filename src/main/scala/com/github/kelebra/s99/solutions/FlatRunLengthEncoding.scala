package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

trait FlatRunLengthEncoding extends RunLengthEncoding {

  def flatEncode[T](list: List[T]): List[Either[T, (Int, T)]] =
    encode(list).map {
      case (1, data) ⇒ Left(data)
      case data      ⇒ Right(data)
    }
}

@Solution(number = 11, input = "List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)")
object FlatRunLengthEncoding extends FlatRunLengthEncoding {

  def apply[T](list: List[T]): List[Either[T, (Int, T)]] = flatEncode(list)
}