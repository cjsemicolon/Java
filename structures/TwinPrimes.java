public class TwinPrimes {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int counter = 2; counter <= Math.sqrt(n); counter++) {
            if (n % counter == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int counter = 2; counter < 1200; counter++) {
            if (isPrime(counter) && isPrime(counter + 2)) {
                System.out.println("(" + counter + ", " + (counter + 2) + ")");
            }
        }
    }
}
