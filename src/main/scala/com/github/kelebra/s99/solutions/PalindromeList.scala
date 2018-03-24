package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.problems

trait PalindromeList extends problems.PalindromeList {

  self: problems.ReverseList ⇒

  final def isPalindrome[T](list: List[T]): Boolean = list == self.reverse(list)
}
