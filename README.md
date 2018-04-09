## Project status:
![Progress](http://progressed.io/bar/13?title=done) [![Build Status](https://travis-ci.org/kelebra/s-99.svg?branch=master)](https://travis-ci.org/kelebra/s-99) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/1d6879f769b14cb6be581d36fe5f3897)](https://www.codacy.com/app/kelebra20/s-99?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=kelebra/s-99&amp;utm_campaign=Badge_Grade) [![Codacy Badge](https://api.codacy.com/project/badge/Coverage/1d6879f769b14cb6be581d36fe5f3897)](https://www.codacy.com/app/kelebra20/s-99?utm_source=github.com&utm_medium=referral&utm_content=kelebra/s-99&utm_campaign=Badge_Coverage)
# Solutions to [Scala 99](http://aperiodic.net/phil/scala/s-99/) Problems:

```scala
scala> import com.github.kelebra.s99.solutions._
import com.github.kelebra.s99.solutions._
```
      

## #1: last element in list
```scala
scala> LastElementInList(1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil)
res0: Int = 8
```
           
## #2: penultimate element in list
```scala
scala> PenultimateElementInList(1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil)
res1: Int = 5
```
           
## #3: nth element in list
```scala
scala> NthElementInList(1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil, 2)
res2: Int = 2
```
           
## #4: length of list
```scala
scala> LengthOfList(1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil)
res3: Int = 6
```
           
## #5: reverse list
```scala
scala> ReverseList(1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil)
res4: List[Int] = List(8, 5, 3, 2, 1, 1)
```
           
## #6: palindrome list
```scala
scala> PalindromeList(1 :: 2 :: 3 :: 2 :: 1 :: Nil)
res5: Boolean = true
```
           
## #7: flatten list
```scala
scala> FlattenList(List(1, 1) :: 2 :: List(3, List(5, 8)) :: Nil)
res6: List[Any] = List(1, 1, 2, 3, 5, 8)
```
           
## #8: eliminate consecutive duplicates
```scala
scala> EliminateConsecutiveDuplicates(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res7: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
```
           
## #9: pack consecutive duplicates
```scala
scala> PackConsecutiveDuplicates(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res8: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
```
           
## #10: run length encoding
```scala
scala> RunLengthEncoding(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res9: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```
           
## #11: flat run length encoding
```scala
scala> FlatRunLengthEncoding(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res10: List[Either[Symbol,(Int, Symbol)]] = List(Right((4,'a)), Left('b), Right((2,'c)), Right((2,'a)), Left('d), Right((4,'e)))
```
           
## #12: run length decoding
```scala
scala> RunLengthDecoding(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
res11: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
```
           
## #13: independent run length encoding
```scala
scala> IndependentRunLengthEncoding(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res12: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```
           
