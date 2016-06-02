//A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], 
//which means that exactly one element is missing.
//Your goal is to find that missing element.
//Write a function:
//class Solution { public int solution(int[] A); }
//that, given a zero-indexed array A, returns the value of the missing element.
//For example, given array A such that:
//  A[0] = 2
//  A[1] = 3
//  A[2] = 1
//  A[3] = 5
//the function should return 4, as it is the missing element.

class MissingElement(){
  def calculate(elements:Array[Int]): Int = {
    val expectedSum = sum(elements.length + 1)

    val actualSum = elements.foldLeft(0)(_+_)

    val missingElement = expectedSum - actualSum
    missingElement
  }

  def sum(n: Int) : Int = {
    (n * (n+1)) / 2
  }
}
