package Functions;

import java.util.Scanner;

public class allPrimeInRange {

  public static void printPrimes(int n) {
    for (int i = 2; i <= n; i++) {
      if (checkPrime.isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    printPrimes(7);
    // System.out.println(isPrime(5));
    sc.close();
  }
}
