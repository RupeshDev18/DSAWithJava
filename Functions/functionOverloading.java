package Functions;

import java.util.Scanner;

public class functionOverloading {

  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static float sum(float a, float b) {
    return a + b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("3+2 " + (sum(3, 2)));
    System.out.println("3+2 " + (sum(3.2f, 2.8f)));
    System.out.println("3+2+5 " + (sum(3, 2, 5)));
    sc.close();
  }
}
