import java.util.Scanner;

    public class rectanglePerimeter{

        public static void main(String[] args){
    
            Scanner edgeCollector = new Scanner(System.in);

                System.out.print("Enter first edge: ");
                double edge1 = edgeCollector.nextDouble();

                System.out.print("Enter second edge: ");
                double edge2 = edgeCollector.nextDouble();

                    if (edge1 != edge2) {
                        double perimeter = 2 * (edge1 + edge2);
                        System.out.println("Perimeter = " + perimeter);
                   } else {
                         System.out.println("Invalid input: edges must be different.");
        }

    }

}
