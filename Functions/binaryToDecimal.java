package Functions;

import java.util.Scanner;

public class binaryToDecimal {

  public static void binaryToDec(int n) {
    int a = n;
    int pow = 0;
    int decNum = 0;

    while (n > 0) {
      int lastDigit = n % 10;
      decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

      pow++;
      n = n / 10;
    }
    System.out.println("decimal of " + a + " =" + decNum);
  }

  public static void decToBin(int n) {
    int pow = 0;
    int binNum = 0;
    while (n > 0) {
      int rem = n % 2;
      binNum = binNum + (rem * (int) Math.pow(10, pow));
      pow++;
      n = n / 2;
    }
    System.out.println("binary form of number " + binNum);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println(isPrime(5));
    // System.out.println(decToBin(7));
    decToBin(12);
    sc.close();
  }
}
