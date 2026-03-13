import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(100) + 1; // 1 to 100
        int attempts = 0;
        int guess = 0;
        int maxAttempts = 10;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");
        
        while (guess != randomNumber && attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            
            if (guess == randomNumber) {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        if (attempts >= maxAttempts && guess != randomNumber) {
            System.out.println("Sorry, you've used all attempts. The correct number was: " + randomNumber);
        }
        
        sc.close();
    }
}
