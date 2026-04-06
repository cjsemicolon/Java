import java.util.Scanner;
public class rainbowDisplay{

public static void main(String[] args){

    int randomNumber = (int)(Math.random()*6)+1;

    System.out.println("Generated number: " + randomNumber);

switch(randomNumber){
      case 1:
        System.out.print("Red");
        break;

       case 2:
        System.out.print("Orange");
        break;

       case 3:
        System.out.print("Yellow");
        break;

       case 4:
        System.out.print("Green");
        break;

       case 5:
        System.out.print("Blue");
        break;

       case 6:
        System.out.print("Indigo");
        break;

        case 7:
        System.out.print("Violet");
        break;
 

        }
   



    }


}

