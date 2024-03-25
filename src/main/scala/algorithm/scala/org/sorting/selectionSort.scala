package algorithm.scala.org.sorting

class selectionSort {
  /**
   * About: Selection sort Algorithm
   * The selection sort algorithm sorts an array by repeatedly finding the minimum element
   * (considering ascending order) from unsorted part and putting it at the beginning.
   * The algorithm maintains two sub-arrays in a given array.
   *
   * 1) The sub-array which is already sorted.
   * 2) Remaining sub-array which is unsorted.
   *
   * In every iteration of selection sort, the minimum element (considering ascending order)
   * from the unsorted sub-array is picked and moved to the sorted sub-array.
   * Time Complexity: O(n*n)
   *
   * @param arr -> Elements in Array
   */
  def selectionSort(arr: Array[Int]): Unit = {
    var min = 0
    for (i <- arr.indices) {
      min = i
      for (j <- i + 1 until arr.length) {
        if (arr(min) > arr(j)) {
          min = j
        }
      }
      val temp = arr(i)
      arr(i) = arr(min)
      arr(min) = temp
    }
  }

  /**
   * This method prints element of an array
   *
   * @param array -> Input array
   */
  def printArray(array: Array[Int]): Unit = {
    println("Sorted array after Implementing Selection sort:")
    for (i <- array.indices) {
      print(array(i) + " ")
    }
  }

}

object selectionSort {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(6, 8, 3, 77, 68, 55, 88, 25, 98, 17)
    val ss = new selectionSort
    ss.selectionSort(arr)
    ss.printArray(arr)
  }
}