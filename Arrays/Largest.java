package Arrays;

public class Largest {

  public static int largest(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
    }
    return max;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 6, 8, 10, 12, 14, 16 };
    System.out.println("Largest Element is " + largest(arr));
  }
}
