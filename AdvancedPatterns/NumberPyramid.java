package AdvancedPatterns;

public class NumberPyramid {

  public static void printnumPyramid(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print((i + 1) + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printnumPyramid(5);
  }
}
