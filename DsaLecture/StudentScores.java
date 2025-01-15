package DsaLecture;

import java.util.Scanner;

public class StudentScores {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Get the number of students
      System.out.print("Enter the number of students: ");
      int numStudents = scanner.nextInt();
      scanner.nextLine();
      
      // Get the scores for each student
      int[] scores = new int[numStudents];
      for (int i = 0; i < numStudents; i++) {
        System.out.print("Enter score for student " + (i + 1) + ": ");
        scores[i] = scanner.nextInt();
        scanner.nextLine();

      }

      // Calculate the highest score
      int highestScore = scores[0];
      for (int i = 1; i < numStudents; i++) {
        if (scores[i] > highestScore) {
          highestScore = scores[i];
        }
      }

      // Calculate the average score
      int sum = 0;
      for (int i = 0; i < numStudents; i++) {
        sum += scores[i];

      }
      double avg = (double) sum / numStudents;

      // Find the score above the average
      int aboveAvg = 0;
      for (int i = 0; i < numStudents; i++) {
        if (scores[i] > avg) {
          aboveAvg++;
        }
      }

      // Print the results
      System.out.println("Highest score: " + highestScore);
      System.out.println("Average score: " + avg);
      System.out.println("Number of students above average: " + aboveAvg);
    }
  }
}
