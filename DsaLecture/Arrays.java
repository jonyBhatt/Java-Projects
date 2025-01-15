package DsaLecture;

import java.util.Scanner;

public class Arrays {
  public static void main(String[] args) {
    // int arrays
    int[] rolls = { 1, 2, 3, 4, 5, 6, 7 };

    // string arrays
    String[] names = { "John", "Mary", "David", "Emma" };

    // traverse to the arrays
    for (int i = 0; i < rolls.length; i++) {
      // System.out.println(rolls[i]);
    }
    for (int i = 0; i < names.length; i++) {
      // System.out.println(names[i]);
    }

    // Multi Dimensional array
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    // traverse multi dimensional arrays
    for (int[] matrix1 : matrix) {
      for (int j = 0; j < matrix1.length; j++) {
        // System.out.println(matrix1[j]);
      }
    }

    // Finding the maximum value in an array
    FindMaxValueInArray();

    // Reverse an array
    ReverseArray();

    // Sum of elements
    SumOfElements();

    // Search through the array
    SearchThroughArray();

  }

  static void FindMaxValueInArray() {
    int[] numbers = { 10, 20, 30, 40, 50 };
    int max = numbers[0];

    for (int num : numbers) {
      if (num > max) {
        max = num;
      }
    }
    System.out.println("Maximum number is: " + max);
  }

  static void ReverseArray() {
    int[] numbers = { 10, 20, 30, 40, 50 };
    int nl = numbers.length / 2;
    System.out.println("Length" + nl);
    for (int i = 0; i < numbers.length / 2; i++) {
      int temp = numbers[i];
      numbers[i] = numbers[numbers.length - 1 - i];
      numbers[numbers.length - 1 - i] = temp;
    }

    for (int n : numbers) {
      System.out.println(n);
    }
  }

  static void SumOfElements() {
    int[] numbers = { 10, 20, 30 };
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    System.out.println("Sum: " + sum);
  }

  static void SearchThroughArray() {
    int[] numbers = { 10, 20, 30, 40, 50 };
    System.out.println("Enter the number you want to search");
    try (Scanner scanner = new Scanner(System.in)) {
      boolean found = false;

      int target = scanner.nextInt();
      int i = 0;

      for (int num : numbers) {
        if (num == target) {

          found = true;

          System.out.println("Found the target at index " + i);

          break;
        }
        i++;
      }

      if (found) {
        System.out.println("Found the target");
      } else {
        System.out.println("Not found");
      }
    }
  }
}
