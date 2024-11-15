package problemsolve;

import java.util.Scanner;

public class FindKm {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    while (t-- > 0) {
      int x = scanner.nextInt();
      // Your code goes here
      int totalKm = (x * 2) * 5;
      System.out.println(totalKm);
    }
  }
}
