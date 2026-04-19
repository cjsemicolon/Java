public class maxNumber{
public static void main(String[] args){
    int result = maximum(10,25);
    
System.out.print("maximum number is " + result);

    }

public static int maximum(int numberOne, int numberTwo) {
    if (numberOne > numberTwo) {
        return numberOne;
    } else {
        return numberTwo;
    }

  }


}
