//write a method to collect numbers and store in array{
//write a method to collect numbers into array list to store in array
//use sentinel loop to keep collecting until the numbers are complete
//}
//write a method that sums the elements of an array so you can calculate the mean
//write a method that collects the returned value of the sum and calculates the mean
//calculate variance
//calculate s.d


import java.util.Scanner;

public class StandardDeviationMethod {

    public static int[] storeNumbers() {

        Scanner inputCollector = new Scanner(System.in);

        int[] numbers = new int[100];

        int count = 0;

        System.out.print("Enter a number or press -1 to cancel");

        int digits = inputCollector.nextInt();

        while(digits != -1) {
            
                numbers[count] = digits;
             
                 count++;              
            
            System.out.print("Enter a number or press -1 to cancel");

            digits = inputCollector.nextInt();          
       
        }

       int[] finalArray = new int[count];

       for(int index = 0; index < count; index++){
    
            finalArray[index] = numbers[index]; 
    
        }
        
        return finalArray;
    }

    public static int sumOfArrayElements(int[] finalArray) {

        int sum = 0;
        for(int index = 0; index < finalArray.length; index++) {
            
            sum += finalArray[index];           

        }
        
        return sum;

    }


    public static double meanOfArrayNumbers(int[] finalArray) {

        int count = finalArray.length;
        int sum = sumOfArrayElements(finalArray);
        double mean = (double)sum/count;

        return mean;

    }

    public static double varianceOfNumbers(int[] finalArray, double mean) {

        double sum = 0;

        for(int index = 0; index < finalArray.length; index++) {

            double difference = finalArray[index] - mean;
            sum += difference * difference;

        }

         double variance = sum/finalArray.length;
    
        return variance;
    
    }

    public static double standardDeviationOfNumbers(double variance) {
    
        double standardDeviation = Math.sqrt(variance);
    
        return standardDeviation;
    
    }










}
