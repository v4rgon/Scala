package test

import main.LabObject
import org.scalatest._

class Tests extends FlatSpec with Matchers {

  it should "The longest word length not recursive " in {
    val check1 = List[String]("apple", "cherry", "pineapple", "watermelon")
    LabObject.longestWordLengthNotRec(check1) should be(10)
  }

  it should "The longest word length recursive(no tail) " in {
    val check1 = List[String]("apple", "cherry", "pineapple", "watermelon")
    LabObject.longestWordLengthRec(check1, 0) should be(10)
  }

  it should "The longest word length tail recursive " in {
    val check1 = List[String]("apple", "cherry", "pineapple", "watermelon")
    LabObject.longestWordLengthTail(check1,0,0) should be(10)
  }

  it should "The begin index of the greatest interval in increasing sequence (recursive)" in {
    val check2 = List[Int](1,2,4,8,15)
    LabObject.maxIndexRec(check2,0) should be (2)
  }

  it should "The begin index of the greatest interval in increasing sequence (tail recursive)" in {
    val check2 = List[Int](1,2,4,8,15)
    LabObject.maxIndexTailRec(check2, check2.head, check2.head) should be (2)
  }
}
