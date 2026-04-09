//write a program that prints from 1-N

import java.util.Scanner;

    public class oneToN{

        public static void main(String[] args){

            Scanner inputCollector = new Scanner(System.in);

            System.out.println("Input loop number: ");

            int userInput = inputCollector.nextInt();

            for(int i = 1; i <= userInput; i++ ) {

                System.out.println(i);
                }


        }




}
