public class booleanEvenorOdd {
    public static void main(String[] args) {
        System.out.println(isEven(10)); 
        System.out.println(isEven(7));  
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
