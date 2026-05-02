import java.util.Scanner;

public class MenstrualApp {

    public static int calculateOvulationDay (int cycleLength) {  

        int ovulationDay = cycleLength - 14;
        return ovulationDay;       

    }

    public static int calculateFertilePeriodStart (int ovulationDay) {

        int fertilePeriodStart = ovulationDay - 5;
        return fertilePeriodStart;
    }

    public static int calculateFertilePeriodEnd (int ovulationDay) {

        int fertilePeriodEnd = ovulationDay + 1;
        return fertilePeriodEnd;

    }

    public static int calculateSafePeriodBefore (int fertilePeriodStart) {

        int safePeriodBefore = fertilePeriodStart - 1;
        return safePeriodBefore;

    }

    public static int calculateSafePeriodAfter (int fertilePeriodEnd) {

        int safePeriodAfter = fertilePeriodEnd + 1;
        return safePeriodAfter;
    }

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter Cycle Length: ");
        int cycleLength = inputCollector.nextInt();

        
        System.out.print("Enter Period Length: ");
        int periodLength = inputCollector.nextInt();

        int ovulationDay = calculateOvulationDay(cycleLength);

        int fertilePeriodStart = calculateFertilePeriodStart(ovulationDay);

        int fertilePeriodEnd = calculateFertilePeriodEnd(ovulationDay);

        int safePeriodBefore = calculateSafePeriodBefore(fertilePeriodStart);

        int safePeriodAfter = calculateSafePeriodAfter(fertilePeriodEnd);

        System.out.println("\n   RESULTS   ");
        System.out.println("Ovulation Day: Day " + ovulationDay);
        System.out.println("Fertile Window: Day " + fertilePeriodStart + " to Day " + fertilePeriodEnd);
        System.out.println("Safe Period Before: Day 1 to Day " + safePeriodBefore);
        System.out.println("Safe Period After: Day " + safePeriodAfter + " to Day " + cycleLength);
        

         

    }








}
