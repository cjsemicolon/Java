import java.util.Random;

public class CrapsGame {

    public static int rollDice() {
        Random roll = new Random();
        return roll.nextInt(6) + 1 + roll.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        int sum = rollDice();
        System.out.println("You rolled: " + sum);

        if (sum == 7 || sum == 11) {
            System.out.println("Natural! You win.");
        } else if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("Craps! You lose.");
        } else {
            int point = sum;
            System.out.println("Point is " + point);

            while (true) {
                sum = rollDice();
                System.out.println("You rolled: " + sum);

                if (sum == point) {
                    System.out.println("You win!");
                    break;
                } else if (sum == 7) {
                    System.out.println("You lose!");
                    break;
                }
            }
        }
    }
}
