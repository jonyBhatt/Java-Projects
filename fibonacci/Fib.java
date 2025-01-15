package fibonacci;

import java.util.Scanner;

public class Fib {
  public static void main(String[] args) {
      int number;
      try (Scanner scan = new Scanner(System.in)) {
          number = scan.nextInt();
      }

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
