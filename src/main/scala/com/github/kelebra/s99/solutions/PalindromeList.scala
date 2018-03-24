package com.github.kelebra.s99.solutions

import com.github.kelebra.s99.problems

import scala.annotation.tailrec

object PalindromeList extends problems.PalindromeList {

  override def isPalindrome[T](list: List[T]): Boolean = {
    @tailrec
    def middle(slow: ⇒ List[T] = list, fast: ⇒ List[T] = list): List[T] =
      fast match {
        case _ :: _ :: tail ⇒ middle(slow.tail, tail)
        case _ :: tail      ⇒ middle(slow.tail, tail)
        case _              ⇒ slow
      }

    @tailrec
    def compare(first: List[T], second: List[T], result: Boolean = true): Boolean =
      (first, second) match {
        case (h1 :: t1, h2 :: t2) ⇒ compare(t1, t2, result && h1 == h2)
        case (Nil, Nil)           ⇒ result
        case _                    ⇒ false
      }

    list match {
      case Nil | _ :: Nil ⇒ true
      case _              ⇒ compare(list, middle())
    }
  }
}
