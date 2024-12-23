package algorithm.scala.org.sorting

class bubbleSort {
  /**
   * About: Bubble Sort
   * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
   * if they are in wrong order.
   * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
   * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
   *
   * @param a -> Array of Elements
   */
  def BubbleSort(a: Array[Int]): Array[Int] = {
    for (i <- a.indices) {
      for (j <- i + 1 until a.length) {
        if (a(i) > a(j)) {
          val temp = a(j)
          a(j) = a(i)
          a(i) = temp
        }
      }
    }
    a
  }
}

object bubbleSort {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(8, 9, 17, 1, 6, 77, 55, 8, 9)
    // Instance of class bubbleSort
    val BS = new bubbleSort
    val output = BS.BubbleSort(arr)

    println("Sorted array after Implementing Bubble sort:")
    for (i <- output.indices) {
      print(output(i) + " ")
    }

  }
}
