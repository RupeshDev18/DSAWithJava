package Functions;

import java.util.Scanner;

public class productOfNumbers {

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers to be multiplied : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int prod = multiply(a, b);
    System.out.println("product of " + a + " and " + b + " is " + prod);
    sc.close();
  }
}
