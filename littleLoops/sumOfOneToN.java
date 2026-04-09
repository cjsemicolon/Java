//write a program that prints sum of integers from 1-N

import java.util.Scanner;

    public class sumOfOneToN{

        public static void main(String[] args){

            Scanner inputCollector = new Scanner(System.in);

            System.out.println("Input loop number: ");

            int userInput = inputCollector.nextInt();

            int sum = 1;

            for(int i = 1; i <= userInput; i++ ) {

                System.out.println(sum + i);
                }


        }




}
