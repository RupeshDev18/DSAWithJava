package Functions;

import java.util.Scanner;

public class binomialCoefficent {

  public static int NCR(int n, int r) {
    int nCr = Factorial.fact(n) / Factorial.fact(r) * Factorial.fact(n - r);
    return nCr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the n and r  : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(" NCR : " + NCR(a, b));
    sc.close();
  }
}
