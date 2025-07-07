import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        boolean playAgain = true;

        System.out.println("Welcome to Rock-Paper-Scissors!");
        
        while (playAgain) {
            System.out.print("\nEnter your move (rock/paper/scissors): ");
            String playerMove = scanner.nextLine().toLowerCase();

            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }

            int randomIndex = random.nextInt(3);
            String computerMove = choices[randomIndex];

            System.out.println("Computer chose: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
                       (playerMove.equals("scissors") && computerMove.equals("paper")) ||
                       (playerMove.equals("paper") && computerMove.equals("rock"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.print("\nPlay again? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            playAgain = response.equals("yes");
