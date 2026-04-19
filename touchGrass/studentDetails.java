import java.util.Scanner;

public class studentDetails {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter major (I, C, or A): ");
        char major = inputCollector.nextLine().charAt(0);

        System.out.print("Enter year (1-4): ");
        int year = inputCollector.nextInt();

        String majorName = " ";
        String yearName = " ";

        switch (Character.toUpperCase(major)) {
            case 'I':
                majorName = "Information Management";
                break;
            case 'C':
                majorName = "Computer Science";
                break;
            case 'A':
                majorName = "Accounting";
                break;
            default:
                System.out.println("Invalid major input");
                break;
        }

        switch (year) {
            case 1:
                yearName = "Freshman";
                break;
            case 2:
                yearName = "Sophomore";
                break;
            case 3:
                yearName = "Junior";
                break;
            case 4:
                yearName = "Senior";
                break;
            default:
                System.out.println("Invalid year input");
                break;
              
        }

        System.out.println("Major: " + majorName);
        System.out.println("Year: " + yearName);

    }
}
