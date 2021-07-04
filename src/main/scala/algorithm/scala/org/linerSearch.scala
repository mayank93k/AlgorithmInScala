package algorithm.scala.org

class linerSearch {
  /**
    * About: Linear Search
    * Given an array arr[] of n elements, To search a given element x in arr[] by using linear Search.
    * The time complexity of  algorithm is O(n).
    *
    * @param a   -> Elements in array
    * @param key -> key element to search
    */
  def searchLinear(a: Array[Int], key: Int): Int = {
    for (i <- 0 to a.length - 1)
      if (a(i) == key)
      return  i
    -1
  }
}

object linerSearch {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(5, 9, 1, 6, 7, 8, 1)
    // Instance of class bubbleSort
    val key = 121
    val ls = new linerSearch
    val output = ls.searchLinear(arr, key)

    if (output.equals(-1)) {
      println("Element not present")
    } else {
      println("Element is present at index "+ output)
    }
  }
}
