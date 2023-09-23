package AdvancedPatterns;

public class invertedHalfPyramidWithNumbers {

  public static void printPyramidNumber(int n) {
    for (int i = 0; i < n; i++) {
      int a = 1;
      for (int j = 0; j < n - i; j++) {
        System.out.print(a);
        a++;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printPyramidNumber(4);
  }
}
