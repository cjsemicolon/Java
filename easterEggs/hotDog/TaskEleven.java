import java.util.Scanner;

public class TaskEleven{

public static void main(String[] args){

    Scanner yearCollector = new Scanner(System.in);

    int totalSecondsPerYear = 365 * 24 * 60 * 60;

    int currentPopulation = 312032486;
    int birthsPerSec = 7;
    int deathsPerSec = 13;
    int immigrantsPerSec = 46;

    int yearlyBirths = totalSecondsPerYear/birthsPerSec;

    int yearlyDeaths = totalSecondsPerYear/deathsPerSec;

    int yearlyImmigrants = totalSecondsPerYear/immigrantsPerSec;

    int yearlyPopulationChange = yearlyBirths - yearlyDeaths + yearlyImmigrants;

    System.out.printf("The population increases by %d yearly%n", yearlyPopulationChange);

    int yearOne = currentPopulation + yearlyPopulationChange;
    int yearTwo = yearOne + yearlyPopulationChange;
    int yearThree = yearTwo + yearlyPopulationChange;
    int yearFour = yearThree + yearlyPopulationChange;
    int yearFive = yearFour + yearlyPopulationChange;

    System.out.println("Enter Year in words,no spaces, start with small letters and capitalize the first letter of each number:");  

    String year = yearCollector.nextLine();

    System.out.print(year);
    


    }

}
