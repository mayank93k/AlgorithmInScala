package algorithm.scala.org.sorting

class insertionSort {
  /**
   * About: Insertion Sort Algorithm
   *
   * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
   * Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
   * At each iteration, insertion sort removes one element from the input data, finds the location it belongs
   * within the sorted list, and inserts it there. It repeats until no input elements remain.
   * TimeComplexity: O(n*n)
   */
  def InsertionSort(arr: Array[Int]): Unit = {
    for (i <- 1 until arr.length) {
      var j = i
      while (j > 0 && arr(j - 1) > arr(j)) {
        val temp = arr(j)
        arr(j) = arr(j - 1)
        arr(j - 1) = temp
        j -= 1
      }
    }
  }

  /**
   * This method prints element of an array
   *
   * @param array -> Input array
   */
  def printArray(array: Array[Int]): Unit = {
    println("Sorted array after Implementing insertion sort:")
    for (i <- array.indices) {
      print(array(i) + " ")
    }
  }
}

object insertionSort {
  def main(args: Array[String]): Unit = {
    val array: Array[Int] = Array(8, 7, 2, 5, 6, 1)
    val is = new insertionSort
    is.InsertionSort(array)
    is.printArray(array)
  }
}