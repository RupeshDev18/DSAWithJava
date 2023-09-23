package Functions;

import java.util.Scanner;

public class callByValueAndReference {

  public static void swapNumbers(int a, int b) {
    int c = a;
    a = b;
    b = c;
    System.out.println(" In Function : \n After Swap a: " + a + " b: " + b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers to be swapped : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Before Swap a: " + a + " b: " + b);
    swapNumbers(a, b);
    System.out.println("In Main Function \n After Swap a: " + a + " b: " + b);
    sc.close();
  }
}
