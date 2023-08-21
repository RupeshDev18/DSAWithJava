package Patterns;

import java.util.Scanner;

public class star4 {

  public static void main(String[] args) {
    System.out.println(
      "Please enter the number of lines for which you want stars:"
    );
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println("****");
    }
    sc.close();
  }
}
