import java.util.Scanner;
public class TaskOne {

    public static void main(String[] args) {

        int [] scores = new int [11];
        Scanner inputCollector = new Scanner(System.in);
        for(int counter = 1; counter <= 10; counter++) {
            System.out.print("Enter Score: ");
             scores[counter] = inputCollector.nextInt();

            }       
        
        for(int number = 0; number < scores.length; number++)

             System.out.print(scores[number]);

    }

    

}
