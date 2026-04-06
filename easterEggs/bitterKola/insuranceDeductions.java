import java.util.Scanner;

public class insuranceDeductions{
    public static void main(String[] args) {

        Scanner insuranceDeductions = new Scanner(System.in);

        System.out.print("Enter salary (₦): ");
        double salary = insuranceDeductions.nextDouble();

        double deduction = 0;

        if (salary <= 50000) {
            deduction = 0;
        } else if (salary <= 150000) {
            deduction = salary * 0.05;
        } else if (salary <= 500000) {
            deduction = salary * 0.075;
        } else {
            deduction = salary * 0.10;
        }

        System.out.printf("Social insurance deduction: ₦%.2f\n", deduction);

    }
}
