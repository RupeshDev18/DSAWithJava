package Arrays;

public class PairsArray {

  public static void pairs(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        System.out.print("(" + i + "," + j + ")");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 6, 8, 10, 12, 14, 16 };
    pairs(arr);
  }
}
