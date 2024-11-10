package functions;

import java.util.Arrays;

public class SwapNumbers {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    swap(a, b);
    variableArgs("Hello", "How are you?","I'm Fine");
    // System.out.println("Numbers:  " + a + "" + b);
  }

  static void swap(int a, int b) {
    int temp;
    temp = a;
    a = b;
    b = temp;
    // System.out.println("Swap numbers: " + a + "" + b);
  }

  static void variableArgs(String ...s){
    System.out.println(Arrays.toString(s));
  }
}
