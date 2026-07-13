import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[]  args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            int n= scanner.nextInt();
            int[] arr= new int[n];

            for(int j=0; j<n; j++){
                arr[j]= scanner.nextInt();
            }
            Arrays.sort(arr);
            boolean possible= true;

            for(int k=1; k<n; k++){
                if(arr[k] - arr[k-1] > 1){
                    possible= false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}