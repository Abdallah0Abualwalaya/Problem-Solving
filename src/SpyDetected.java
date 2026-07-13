import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            int arrLen= scanner.nextInt();
            int[] arr= new int[arrLen];

            for(int j=0; j<arrLen; j++){
                arr[j]= scanner.nextInt();
            }

            int common;
            if(arr[0] == arr[1]){
                common= arr[0];
            }
            else if(arr[0] == arr[2]){
                common= arr[0];
            }
            else{
                common= arr[1];
            }

            for(int j=0; j<arrLen; j++){
                if(arr[j] != common){
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
}