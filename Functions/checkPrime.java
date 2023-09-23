package Functions;

import java.util.Scanner;

public class checkPrime {

  public static boolean isPrime(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n == 2) return true;
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(isPrime(5));
    sc.close();
  }
}
