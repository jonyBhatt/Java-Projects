package fibonacci;

import java.util.Scanner;

public class Fib {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    scan.close();

    int start = 0;
    int next = 1;

    int count = 2;
    while (count <= number) {
      int temp = next;
      next = next+ start;
      start = temp;
      count++;
    }

    System.out.println(start);

  }
}
