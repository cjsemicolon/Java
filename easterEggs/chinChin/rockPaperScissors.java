import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner decision = new Scanner(System.in);

        int computer = (int)(Math.random() * 3);

        System.out.print("Enter 0 for Scissors, 1 for Rock and 2 for Paper: ");
        int user = decision.nextInt();

        System.out.println("Computer chose: " + computer);
        System.out.println("You chose: " + user);


        if (user == computer) {
            System.out.println("draw!");
        } 
        else if ((user == 0 && computer == 2) ||   // Scissor beats Paper
                 (user == 1 && computer == 0) ||   // Rock beats Scissor
                 (user == 2 && computer == 1)) {   // Paper beats Rock
            System.out.println("You win!");
        } 
        else {
            System.out.println("You lose!");
        }
    }
}
