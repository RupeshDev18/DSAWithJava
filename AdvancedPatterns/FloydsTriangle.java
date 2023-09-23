package AdvancedPatterns;

public class FloydsTriangle {

  public static void printFloyd(int n) {
    int a = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(a + " ");
        a++;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printFloyd(4);
  }
}
