package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensioanl {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      int[][] arr = new int[2][3];

        for (int[] arr1 : arr) {
            for (int col = 0; col < arr1.length; col++) {
                arr1[col] = scan.nextInt();
            }
        }

      for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[row].length; col++) {
        // System.out.println("Print Array: " + arr[row][col] + " ");
        // // arr[row][col] = scan.nextInt();
        // }
        System.out.println(Arrays.toString(arr[row]));
      }
    }
  }

}
