package AdvancedPatterns;

public class hollowRhombus {

  public static void printHollowRhombus(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < n; j++) {
        if (i == 0 || j == 0 || j == n - 1 || i == n - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printHollowRhombus(4);
  }
}
