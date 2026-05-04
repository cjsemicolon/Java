public class TaskSix{
    public static int number(int[] list){
        int sum = 0;

        for(int index = 0; index < list.length; index++) {
            if(index % 2 == 0) { 
                sum += list[index]; 
            }
        }
        return sum; 
    }
}
