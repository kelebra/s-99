# Project status
![Progress](http://progressed.io/bar/23?title=done) [![Build Status](https://travis-ci.org/kelebra/s-99.svg?branch=master)](https://travis-ci.org/kelebra/s-99) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/1d6879f769b14cb6be581d36fe5f3897)](https://www.codacy.com/app/kelebra20/s-99?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=kelebra/s-99&amp;utm_campaign=Badge_Grade) [![Codacy Badge](https://api.codacy.com/project/badge/Coverage/1d6879f769b14cb6be581d36fe5f3897)](https://www.codacy.com/app/kelebra20/s-99?utm_source=github.com&utm_medium=referral&utm_content=kelebra/s-99&utm_campaign=Badge_Coverage)
# Solutions to [Scala 99](http://aperiodic.net/phil/scala/s-99/) Problems

```scala
scala> import com.github.kelebra.s99.solutions._
import com.github.kelebra.s99.solutions._
```
      

#### 1. Last element in list
```scala
scala> LastElementInList(1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil)
res0: Int = 8
```
           
#### 2. Penultimate element in list
```scala
scala> PenultimateElementInList(1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil)
res1: Int = 5
```
           
#### 3. Nth element in list
```scala
scala> NthElementInList(1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil, 2)
res2: Int = 2
```
           
#### 4. Length of list
```scala
scala> LengthOfList(1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil)
res3: Int = 6
```
           
#### 5. Reverse list
```scala
scala> ReverseList(1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil)
res4: List[Int] = List(8, 5, 3, 2, 1, 1)
```
           
#### 6. Palindrome list
```scala
scala> PalindromeList(1 :: 2 :: 3 :: 2 :: 1 :: Nil)
res5: Boolean = true
```
           
#### 7. Flatten list
```scala
scala> FlattenList(List(1, 1) :: 2 :: List(3, List(5, 8)) :: Nil)
res6: List[Any] = List(1, 1, 2, 3, 5, 8)
```
           
#### 8. Eliminate consecutive duplicates
```scala
scala> EliminateConsecutiveDuplicates(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res7: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
```
           
#### 9. Pack consecutive duplicates
```scala
scala> PackConsecutiveDuplicates(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res8: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
```
           
#### 10. Run length encoding
```scala
scala> RunLengthEncoding(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res9: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```
           
#### 11. Flat run length encoding
```scala
scala> FlatRunLengthEncoding(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res10: List[Either[Symbol,(Int, Symbol)]] = List(Right((4,'a)), Left('b), Right((2,'c)), Right((2,'a)), Left('d), Right((4,'e)))
```
           
#### 12. Run length decoding
```scala
scala> RunLengthDecoding(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
res11: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
```
           
#### 13. Independent run length encoding
```scala
scala> IndependentRunLengthEncoding(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res12: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```
           
#### 14. Duplicate elements
```scala
scala> DuplicateElements('a :: 'b :: 'c :: 'c :: 'd :: Nil)
res13: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
```
           
#### 15. Duplicate elements n times
```scala
scala> DuplicateElementsNTimes('a :: 'b :: 'c :: 'c :: 'd :: Nil, 3)
res14: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
```
           
#### 16. Drop every nth element
```scala
scala> DropEveryNthElement(List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k), 3)
res15: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
```
           
#### 17. Split list in two parts
```scala
scala> SplitListInTwoParts(List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k), 3)
res16: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
```
           
#### 18. Slice list
```scala
scala> SliceList(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res17: List[Symbol] = List('d, 'e, 'f, 'g)
```
           
#### 19. Rotate list left
```scala
scala> RotateListLeft(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res18: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
```
           
#### 20. Remove element in list
```scala
scala> RemoveElementInList(1, List('a, 'b, 'c, 'd))
res19: (List[Symbol], Option[Symbol]) = (List('a, 'c, 'd),Some('b))
```
           
#### 21. Insert element in list
```scala
scala> InsertElementInList('new, 1, List('a, 'b, 'c, 'd))
res20: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
```
           
#### 22. Range
```scala
scala> Range(4, 9)
res21: List[Int] = List(4, 5, 6, 7, 8, 9)
```
           
#### 23. Random select from list
```scala
scala> RandomSelectFromList(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
res22: List[Symbol] = List('d, 'g, 'f)
```
           
