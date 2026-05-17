import java.util.Scanner;

public class ArrivalGeneral {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int numberOfSoliders= scanner.nextInt();
        int[] arr= new int[numberOfSoliders];

        for(int i=0; i<numberOfSoliders; i++){
            arr[i]= scanner.nextInt();
        }

        int max= arr[0];
        int min= arr[0];

        int maxIndex= 0;
        int minIndex= 0;

        for(int i=0; i<numberOfSoliders; i++){
            if(arr[i] > max){
                max= arr[i];
                maxIndex= i;
            }
            if(arr[i] <= min){
                min= arr[i];
                minIndex= i;
            }
        }

        int moves= maxIndex + (numberOfSoliders - 1 - minIndex);

        if(maxIndex > minIndex){
            moves--;
        }
        System.out.println(moves);
    }
}