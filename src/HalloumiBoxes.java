import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            int n= scanner.nextInt();
            int k= scanner.nextInt();

            int[] arr= new int[n];
            for(int j=0; j<n; j++){
                arr[j]= scanner.nextInt();
            }

            if(k > 1){
                System.out.println("YES"); //By swapping adjecent elements
            }
            else{
                boolean sorted= true;
                for(int m=0; m<n-1; m++){
                    if(arr[m] > arr[m+1]){
                        sorted= false;
                        break;
                    }
                }
                System.out.println(sorted ? "YES" : "NO");
            }
        }
    }
}