package algorithm.scala.org.searching

class binarySearch {
  /**
   * About: Binary Search
   * Search a sorted array by repeatedly dividing the search interval in half.
   * The time complexity of above algorithm is O(logn).
   *
   * @param a   -> Array element
   * @param key -> Key element to find in array using binary search
   * */
  def BinarySearch(a: Array[Int], key: Int, start: Int, end: Int): Int = {
    //  var start = 0
    //  var end = a.length - 1
    // var mid = 0
    val mid = (start + end) / 2
    if (start <= end) {

      if (a(mid) == key) {
        return mid
      }
      if (a(mid) < key) {
        //  start = mid + 1
        BinarySearch(a, key, mid + 1, end)
      }
      else {
        //end = mid - 1
        BinarySearch(a, key, start, mid - 1)
      }
    } else {
      -1
    }
  }
}

object binarySearch {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(5, 7, 8, 9, 15, 29, 36, 78)
    val key = 8
    val BS = new binarySearch
    BS.BinarySearch(arr, key, 0, arr.length - 1)
    if (BS.BinarySearch(arr, key, 0, arr.length - 1) == -1) {
      println("Element is not present in the given array.")
    }
    else {
      println("Element is present at index:" + BS.BinarySearch(arr, key, 0, arr.length - 1))
    }
  }
}