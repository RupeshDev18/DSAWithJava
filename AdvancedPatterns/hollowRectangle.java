package AdvancedPatterns;

public class hollowRectangle {

  public static void printHollowRectangle(int n, int m) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (i == 0 || j == 0 || j == m - 1 || i == n - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printHollowRectangle(4, 5);
  }
}
