import java.util.Scanner;
import java.util.Random;

public class GuessNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("NUMBER GAME");
        int lwr = 1;
        int upr = 100;
        int Maxattempts = 5;
        int rounds = 0;
        int score = 0;
        
        boolean playAgain = true;
        while(playAgain)
        {
            int target = rand.nextInt(upr - lwr + 1) + lwr;
            System.out.println("Enter a Number between" + lwr + " and " + upr + ".");
            int attempts = 0;
            while(attempts < Maxattempts)
            {
                System.out.print("Enter your guess:");
                int guess = sc.nextInt();
                attempts++;
                
                if(guess < target)
                {
                    System.out.println("Incorrect Guess,Try a higher number");
                }
                else if(guess > target)
                {
                    System.out.println("Incorrect Guess,Try a lower number");
                }
                else
                {
                    System.out.println("Congratulations. You guessed the Correct number" + target + "correctly in " + attempts + "attempts.");
                    score++;
                    break;
                }
            }
            if(attempts == Maxattempts)
            {
                System.out.println("Sorry, you reached max no. of attempts. The number was " + target);
            }
            rounds++;
            System.out.print("Do you want to play again?(yes/no):");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }
        System.out.println("Game Over! You played" + rounds + "rounds and your final score is" + score);
        sc.close();
    }
}
