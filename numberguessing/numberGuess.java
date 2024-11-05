package numberguessing;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class numberGuess {
  private boolean hasGuess = false;

  public static void main(String[] args) {
    numberGuess game = new numberGuess();
    game.startGame();
  }

  public void startGame() {

    System.out.println("\n Number guessing game \n ");
    System.out.println("\n You have to guess between 1 to 100 range \n ");
    System.out.println("\n You have to guess the number within 10 seconds \n ");
    // Call scanner class as userInput
    Scanner scan = new Scanner(System.in);

    // Generate a random number between 1 and 100
    int number = (int) (Math.random() * 100) + 1;

    // Initialize the number of guesses
    int guesses = 0;

    // Add timer to user guess
    Timer timer = new Timer();
    timer.schedule(new TimerTask() {
      @Override
      public void run() {
        if (!hasGuess) {
          System.out.println("\nTime is over! The number was: " + number);
          System.exit(0);
        }
      }
    }, 10000);

    // logic
    while (guesses < 3 && !hasGuess) {
      System.out.println("Guess The number: ");
      int userInput = scan.nextInt();
      guesses++;

      if (userInput == number) {
        System.out.println("Great! You guessed the number in " + guesses + " tries.");
        setHasGuess(true);
        timer.cancel();
        break;
      } else if (userInput < number) {
        System.out.println("Your guess is too low.");
      } else {
        System.out.println("Your guess is too high.");
      }

      System.out.println("You have " + (3 - guesses) + " guesses left.\n");
    }

    if (!hasGuess && guesses == 3) {
      System.out.println("Sorry! You've used all your guesses. The number was: " + number);
      timer.cancel(); // Stop the timer since the game has ended
    }

    scan.close();
    System.out.println("Number is:  " + (number));
  }

  public void setHasGuess(boolean value) {
    hasGuess = value;
  }
}
