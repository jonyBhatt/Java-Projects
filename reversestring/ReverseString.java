package reversestring;

import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
    char ch;
    String temp = "";
    Scanner scan = new Scanner(System.in);
    System.out.println("Write a string: " );
    String str = scan.nextLine();
    scan.close();
    System.out.println("\n" + "Given String: " + str + "\n");

    for (int i = 0; i < str.length(); i++) {
      ch = str.charAt(i);
      temp = ch + temp;
    }
    System.out.println("Reverse String: " + temp);
  }
}
