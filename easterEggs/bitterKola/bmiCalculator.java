import java.util.Scanner;

public class bmiCalculator {
    public static void main(String[] args) {

        Scanner weightCollector = new Scanner(System.in);

        System.out.print("input weight (in kg): ");
        double weight = weightCollector.nextDouble();

        System.out.print("input height (in meters): ");
        double height = weightCollector.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

    }
}
