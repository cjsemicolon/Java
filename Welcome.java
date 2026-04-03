import java.util.Scanner;
public class Welcome{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String userName = input.nextLine();

        System.out.println("How old are you");
        int userAge = input.nextInt();

        System.out.printf("Hello %S you are %d years old%n", userName, userAge);

    }


}
