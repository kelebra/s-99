package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution

trait PalindromeList extends ReverseList {

  final def isPalindrome[T](list: List[T]): Boolean = list == reverse(list)
}

@Solution(number = 6, input = "1 :: 2 :: 3 :: 2 :: 1 :: Nil")
object PalindromeList extends PalindromeList {

  def apply[T](list: List[T]): Boolean = isPalindrome(list)
}