package leetcode;

public class Palindrome {
  public static void main(String[] args) {
    System.out.println(isPalindrome(123));
  }

  public static boolean isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0))
      return false;
    int reversed = 0;
    while (x > reversed) {
      int remainder = x % 10;
      reversed = reversed * 10 + remainder;
      x /= 10;
    }
    return x == reversed || x == reversed / 10;
  }
}
