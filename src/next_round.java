import java.util.Scanner;

public class next_round {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int number_contestants= scanner.nextInt();
        int k= scanner.nextInt();

        int arr[]= new int[number_contestants];

        for(int i=0; i<number_contestants; i++){
            arr[i]= scanner.nextInt();
        }

        int threshold= arr[k-1];
        int count=0;

        for(int i=0; i<number_contestants; i++){
            if(arr[i]>=threshold && arr[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}