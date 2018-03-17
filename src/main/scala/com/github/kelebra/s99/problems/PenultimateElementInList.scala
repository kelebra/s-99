package com.github.kelebra.s99.problems

trait PenultimateElementInList {

  @throws[NoSuchElementException]("if list is empty of has one element")
  def penultimate[T](list: List[T]): T
}
