import java.util.Arrays;

public class TaskFour{
    public static int[] number(int[] list){
       int count = 0;
    for(int index = 0; index < list.length; index++) {
        if(index % 2 == 0) 
            count++;
    }

    int[] even = new int[count];
    int counter = 0;
    for(int index = 0; index < list.length; index++) {
        if(index % 2 == 0) { 
            even[counter] = list[index];
            counter++;
        }
    }

    return even;
}

    public static void main(String[] args) {
        
        int[] evenIndex = {2, 8, 6, 9, 10,3};
        
        System.out.println(Arrays.toString(number(evenIndex)));
    }
}
