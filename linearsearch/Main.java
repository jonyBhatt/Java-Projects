package linearsearch;

public class Main {
  public static void main(String[] args) {
    int[] arr = { 19, 30, 40, 100, 200, 55, 32, 44, 500, 155 };
    int ans = linearSearch(arr, 32);
    System.out.println(ans);
  }

  static int linearSearch(int[] arr, int target) {
    if (arr.length <= 0) {
      return -1;
    }
    for (int i = 0; i < arr.length; i++) {
      int element = arr[i];
      if (element == target) {
        System.out.println("Your target item " + target + " is found at index " + i);
        return i;
      }
    }
    return -1;
  }
}
