package leetcode;

public class RemoveDuplicate {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 3 };
    int result = removeDuplicates(nums);

    // System.out.println(Arrays.toString(result));
    System.out.println(result);
    

  }

  static int removeDuplicates(int[] nums) {
    if (nums.length == 0)
      return 0;

    int k = 0;

    int currentIndexValue;
    // Step 1
    for (int i = 0; i < nums.length - 1; i++) {
      // Step 2
      currentIndexValue = nums[i];
      // Step 3
      if (currentIndexValue != nums[i + 1]) {
        nums[k++] = nums[i];
      }

    }
    nums[k++] = nums[nums.length - 1];

    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = nums[i];
    }

    return k;
  }

}

/**
 * Step 1: Traverse the array
 * Step 2: Find the current index value
 * Step 3: Compare the current index value with the next index value
 * Step 4: If they are equal, remove the next index value
 * Step 5: Push the current array to the expectedNums array
 */
