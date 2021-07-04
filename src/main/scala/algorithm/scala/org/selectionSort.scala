package algorithm.scala.org

class selectionSort {
  /**
    * About: Selection sort Algorithm
    * The selection sort algorithm sorts an array by repeatedly finding the minimum element
    * (considering ascending order) from unsorted part and putting it at the beginning.
    * The algorithm maintains two subarrays in a given array.
    *
    * 1) The subarray which is already sorted.
    * 2) Remaining subarray which is unsorted.
    *
    * In every iteration of selection sort, the minimum element (considering ascending order)
    * from the unsorted subarray is picked and moved to the sorted subarray.
    * Time Complexity: O(n*n)
    *
    * @param arr -> Elements in Array
    */
  def selectionSort(arr: Array[Int]): Unit = {
    var min = 0
    for (i <- 0 to arr.length - 1) {
      min = i
      for (j <- i + 1 to arr.length - 1) {
        if (arr(min) > arr(j)) {
          min = j
        }
      }
      var temp = arr(i)
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
    for (i <- 0 to array.length - 1) {
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