package Patterns;

import java.util.Scanner;

public class characterPattern {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "Please enter the number of lines for which you want character pattern:"
    );
    int n = sc.nextInt();
    char a = 'A';
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(a++);
      }
      System.out.println();
    }
    sc.close();
  }
}
