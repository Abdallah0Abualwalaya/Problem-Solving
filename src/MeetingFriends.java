import java.util.Arrays;
import java.util.Scanner;

public class MeetingFriends {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

       int[] arr= new int[3];
       for(int i=0; i<3; i++){
           arr[i]= scanner.nextInt();
       }

       Arrays.sort(arr);
       int distance= (arr[1]-arr[0]) + (arr[2]-arr[1]);
       System.out.println(distance);
    }
}