package com.github.kelebra.s99.problems

trait NthElementInList {

  @throws[NoSuchElementException]("if list.size < n")
  def nth[T](list: List[T], n: Int): T
}
