import java.util.Scanner;

public class distanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int x1 = inputCollector .nextInt();
        int y1 = inputCollector .nextInt();
        int x2 = inputCollector .nextInt();
        int y2 = inputCollector .nextInt();

        if (x1 == x2)
            System.out.println("Vertical line");
        else if (y1 == y2)
            System.out.println("Horizontal line");
        else
            System.out.println("Not perpendicular to axis");
    }
}
