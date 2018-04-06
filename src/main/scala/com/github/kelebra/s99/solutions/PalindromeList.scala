package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution
import com.github.kelebra.s99.problems

trait PalindromeList extends problems.PalindromeList with ReverseList {

  final def isPalindrome[T](list: List[T]): Boolean = list == reverse(list)
}

@Solution(number = 6, input = "1 :: 2 :: 3 :: 2 :: 1 :: Nil")
object PalindromeList extends PalindromeList {

  def apply[T](list: List[T]): Boolean = isPalindrome(list)
}