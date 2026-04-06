import java.util.Random;

public class variableDifference {
    public static void main(String[] args) {
        Random integer = new Random();

        int num1 = integer.nextInt(10); 
        int num2 = integer.nextInt(10); 

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        int difference = Math.abs(num1 - num2);

        System.out.println("Positive difference: " + difference);
    }
}
