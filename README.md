

      |## Project status:

      |[![Build Status](https://travis-ci.org/kelebra/s-99.svg?branch=master)](https://travis-ci.org/kelebra/s-99)[![Codacy Badge](https://api.codacy.com/project/badge/Grade/1d6879f769b14cb6be581d36fe5f3897)](https://www.codacy.com/app/kelebra20/s-99?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=kelebra/s-99&amp;utm_campaign=Badge_Grade)[![Codacy Badge](https://api.codacy.com/project/badge/Coverage/1d6879f769b14cb6be581d36fe5f3897)](https://www.codacy.com/app/kelebra20/s-99?utm_source=github.com&utm_medium=referral&utm_content=kelebra/s-99&utm_campaign=Badge_Coverage)

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

           
