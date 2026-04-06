import java.util.Scanner;

public class guessFlipResult {
    public static void main(String[] args) {
        Scanner guessCollector = new Scanner(System.in);

        int coin = (int)(Math.random() * 2);

        System.out.print("input guess (0 for Heads, 1 for Tails): ");
        int guess = guessCollector.nextInt();

        if (guess == coin) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }

    }
}
