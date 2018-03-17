package com.github.kelebra.s99.problems

trait LastElementInList {

  @throws[NoSuchElementException]("if list is empty or null")
  def last[T](list: List[T]): T
}
