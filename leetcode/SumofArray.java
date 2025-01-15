package leetcode;

import java.util.Arrays;

public class SumofArray {
  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5 };

    int[] ans = twoSum(arr, 7);
    System.out.println(Arrays.toString(ans));

  }

  public static int[] twoSum(int[] nums, int target) {

    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          int sum = nums[i] + nums[j];
          // System.out.println("Index will be: " + i + j);
          System.out.println("Sum will be:  " + sum);
          return new int[] { i, j };
        }
      }
    }
    return new int[] {};

  }
}
