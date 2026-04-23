public class tableofIncreasingPowers {
    public static void main(String[] args) {
        System.out.println("N\tN2\tN3\tN4");

        for (int number = 1; number <= 5; number++) {
            System.out.println(number + "\t" + (number*number) + "\t" + (number*number*number) + "\t" + (number*number*number*number));
        }
    }
}
