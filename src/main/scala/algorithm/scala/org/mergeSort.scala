package algorithm.scala.org

class mergeSort {
  /**
    * About: MergeSort
    * MergeSort is a Divide and Conquer algorithm. It divides input array in two halves, calls itself for the two halves and
    * then merges the two sorted halves..
    * The time complexity of  algorithm is O(nLogn).
    *
    * @param array -> Input array
    * @param start -> Start position of array
    * @param end   -> End position of array
    */
  def mergeSort(array: Array[Int], start: Int, end: Int): Unit = {
    if (start < end) {
      val mid: Int = (start + end) / 2
      mergeSort(array, start, mid)
      mergeSort(array, mid + 1, end)
      merge(array, start, mid, end)
    }
  }

  /**
    * This method is used for merging two halves.
    *
    * @param arr   -> Input Array
    * @param start -> Start position of array
    * @param mid   ->  Mid position of array
    * @param end   ->  End position of array
    */
  def merge(arr: Array[Int], start: Int, mid: Int, end: Int): Unit = {
    var i = start
    var j = mid + 1
    var k = 0
    val temp: Array[Int] = new Array[Int](end - start + 1)
    while (i <= mid && j <= end) {
      if (arr(i) <= arr(j)) {
        temp(k) = arr(i)
        k += 1
        i += 1
      }
      else {
        temp(k) = arr(j)
        k += 1
        j += 1
      }
    }
    while (i <= mid) {
      temp(k) = arr(i)
      k += 1
      i += 1
    }
    while (j <= end) {
      temp(k) = arr(j)
      k += 1
      j += 1
    }

    for (i <- start to end) {
      arr(i) = temp(i - start)
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

object mergeSort {
  def main(args: Array[String]): Unit = {
    val array: Array[Int] = Array(5, 12, 1, 16, 15, 9, 8, 11)
    println(array.mkString(" "))
    val start = 0
    val end = array.length - 1
    val ms = new mergeSort
    ms.mergeSort(array, start, end)
    ms.printArray(array)
  }
}