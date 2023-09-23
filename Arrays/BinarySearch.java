package Arrays;

public class BinarySearch {

  public static int binary_search(int[] arr, int key) {
    int low = 0, high = arr.length - 1;

    // while (low <= high) {
    while (high >= low) {
      int mid = (low + high) / 2;
      //   int mid = (high - low) / 2 + low;
      //   System.out.println(mid);
      if (arr[mid] == key) {
        return mid;
      } else if (arr[mid] < key) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    // int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    int arr[] = { 2, 3, 4, 6, 8, 10, 12, 14, 16 };
    int key = 10;
    System.out.print(binary_search(arr, key));
  }
}
