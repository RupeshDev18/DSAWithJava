package Functions;

import java.util.Scanner;

public class Factorial {

  public static int fact(int a) {
    int f = 1;
    for (int i = 1; i <= a; i++) {
      f *= i;
    }
    return f;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number whose factorial to be found : ");
    int a = sc.nextInt();
    System.out.println("Factorial of " + a + " is " + fact(a));
    sc.close();
  }
}
