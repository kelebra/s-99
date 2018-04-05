package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.description.Solution
import com.github.kelebra.s99.problems

@Solution(number = 6, input = "List(1, 2, 3, 2, 1)")
trait PalindromeList extends problems.PalindromeList with ReverseList {

  final def isPalindrome[T](list: List[T]): Boolean = list == reverse(list)
}
