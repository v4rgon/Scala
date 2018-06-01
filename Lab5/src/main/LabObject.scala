package main

import scala.annotation.tailrec
import scala.collection.JavaConverters._

object LabObject {
  def main(args: Array[String]): Unit = {
    val mycheck1 = List[Int](8)
    println("Combinations: "+ sumOfTwoNumbers(mycheck1))

    val mycheck3 = List[String]("apple", "cherry", "pineapple", "watermelon")
    println("longest word (not recursive): " + longestWordLengthNotRec(mycheck3))
    println("longest word (recursive): " + longestWordLengthRec(mycheck3, 0))
    println("longest word (tail rec): " + longestWordLengthTail(mycheck3, 0, 0))

  }

  def longestWordLengthNotRec(list: List[String]): Int = {
    var index = 0
    for (i <- 0 to (list.length - 1)) {
      if (list(index).length < list(i).length)
        index = i
    }
    list(index).length
  }

  def longestWordLengthRec(list: List[String], index: Int): Int = {
    if (index < list.length) {
      val next = longestWordLengthRec(list, index + 1)
      if (list(index).length > next)
        list(index).length
      else
        next
    }
    else
      list.head.length
  }

  @tailrec
  def longestWordLengthTail(list: List[String], index: Int = 0, result: Int = 0): Int = {
    if (index == 0) {
      longestWordLengthTail(list, index + 1, list.head.length)
    } else {
      if (index != list.length) {
        longestWordLengthTail(list, index + 1, if (result < list(index).length) list(index).length else result)
      } else {
        result
      }
    }
  }

  def sumOfTwoNumbers(list: List[Int]):Int={

  }

}