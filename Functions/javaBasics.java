package Functions;

import java.util.Scanner;

public class javaBasics {

  public static void calcSum(int a, int b) {
    System.out.println(a + b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 values to be added : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    calcSum(a, b);
    sc.close();
  }
}
