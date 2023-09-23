package Arrays;

public class ReverseArray {

  public static void reverse_arr(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[n - i - 1];
      arr[n - i - 1] = temp;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 10, 34, 21 };
    reverse_arr(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
