package algorithm.scala.org

class quickSort {
  /**
    * In this method given an array and an element x of array as pivot, put x at its correct position in sorted array and put all
    * smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x.
    * All this should be done in linear time.
    *
    * @param array -> Input array
    * @param start -> Start position of the array
    * @param end -> End position of the array
    * @return -> Partition element
    */
  def partition(array: Array[Int], start: Int, end: Int): Int = {
    var i = start - 1
    val pivot: Int = array(end)
    for (j <- start until end) {
      if (array(j) <= pivot) {
        i += 1
        val temp: Int = array(i)
        array(i) = array(j)
        array(j) = temp
      }
    }
    val temp: Int = array(i + 1)
    array(i + 1) = array(end)
    array(end) = temp

    return i + 1
  }

  /**
    * About: QuickSort
    * QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot.
    * Pick last element as pivot
    * The time complexity of  algorithm is O(nLogn).
    *
    * @param array -> Input array
    * @param start -> Start position of array
    * @param end -> End position of array
    */
  def QuickSort(array: Array[Int], start: Int, end: Int): Unit = {
    if (start < end) {
      val pivot: Int = partition(array, start, end)
      QuickSort(array, start, pivot - 1)
      QuickSort(array, pivot + 1, end)
    }
  }

  /**
    * This method prints element of an array
    *
    * @param array -> Input array
    */
  def printArray(array: Array[Int]): Unit = {
    for (i <- 0 to array.length - 1) {
      print(array(i) + " ")
    }
  }
}

object quickSort {
  def main(args: Array[String]): Unit = {
    val array: Array[Int] = Array(5, 12, 1, 16, 15, 9, 8, 11)
    println(array.mkString(" "))
    val start = 0
    val end = array.length - 1
    val qs  = new quickSort
    qs.QuickSort(array, start, end)
    qs.printArray(array)
  }
}
