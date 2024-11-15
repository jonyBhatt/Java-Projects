package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
  public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    // for (int i = 0; i < 5; i++) {
    // int userInputs = scan.nextInt();
    // list.add(userInputs);
    // }
    // scan.close();
    // System.out.println(list);

    // Multi Dimensional Array

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    // Initialize Array. How many array you need
    for (int i = 0; i < 4; i++) {
      list.add(new ArrayList<>());
    }

    // Add element

    // first for loop is for row and second for loop is for column
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        list.get(i).add(scan.nextInt());
      }
    }

    System.out.println(list);

  }
}
