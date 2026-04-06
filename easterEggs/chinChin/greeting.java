import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {

        Scanner currentHour = new Scanner(System.in);
        
            System.out.print("Enter month (0-23)");
               int Hour = currentHour.nextInt();

                  if(Hour >= 5 && Hour <= 11) {

                      System.out.print("Good morning");
                    }

                    else if(Hour >= 12 && Hour <= 17) {

                        System.out.print("Good afternoon");
                    }

                     else if(Hour >= 18 && Hour <= 21) {

                        System.out.print("Good evening");
                    }

                    else if(Hour >= 0 && Hour <=4) {

                        System.out.print("Good night");
                    }

     }

}
