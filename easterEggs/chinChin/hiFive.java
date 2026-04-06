import java.util.Scanner;

    public class hiFive{

        public static void main(String [] args){

            Scanner integer = new Scanner(System.in);

            System.out.println("Enter a number: ");

            int num = integer.nextInt();

            if (num %5 == 0){
            System.out.print("HiFive");
          }

            if (num %2 == 0){
            System.out.print("HiEven");
          }
    
    
    }

             

}
