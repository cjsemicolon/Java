public class TaskEight{
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
