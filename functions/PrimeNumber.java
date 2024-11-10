package functions;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    scan.close();
    boolean isPrime = isPrime(num);
    System.out.println(isPrime);
  }

  static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    int i;
    for (i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return i * i > num;
  }
}
