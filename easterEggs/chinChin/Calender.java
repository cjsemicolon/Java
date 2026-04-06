import java.util.Scanner;

public class Calender{

    public static void main(String[] args) {

    Scanner dateYearCollector = new Scanner(System.in);

    System.out.println("Enter month in number(e.g 1-12):");
    int month = dateYearCollector.nextInt();

    System.out.println("Enter Year:");
    int year = dateYearCollector.nextInt();

    int days;

      switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                days = 30;
                break;
            case 2:  // February
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 0;
        }

        if (days == 0) {
            System.out.println("Invalid month entered!");
        } else {
            System.out.println("Month " + month + " of year " + year + " has " + days + " days.");
        } 


    }

}
