import java.util.Random;

public class coinFlipSimulation {
    public static void main(String[] args) {

        Random randomNumber = new Random();

        int heads = 0;
        int tails = 0;

        for (int counter = 0; counter < 1_000_000; counter++) {

            int flip = randomNumber.nextInt(2); 

            if (flip == 0) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
