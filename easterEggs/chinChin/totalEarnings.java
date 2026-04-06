import java.util.Scanner;

public class totalEarnings {
    public static void main(String[] args) {


    Scanner dataCollector = new Scanner(System.in);

    System.out.println("Input hourly Wage");
    int wage = dataCollector.nextInt();

    System.out.println("Input number of hours worked");
    int hours = dataCollector.nextInt();

    double overTime = wage * 1.5;
        
    double totalWage = wage * hours;

    if(hours > 40) {

              totalWage = overTime * hours;              
           
            }
    else{
    
               totalWage = wage * hours;

            }
        
     System.out.print("Total earnings is =  " + totalWage);  
      
       }

}
