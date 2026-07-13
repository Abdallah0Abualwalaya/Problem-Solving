import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            int n= scanner.nextInt();
            int x= scanner.nextInt();
            int[] stations= new int[n];

            for(int j=0; j<n; j++){
                stations[j]= scanner.nextInt();
            }
            int max= stations[0];

            for(int j=1; j<n; j++){
                max= Math.max(max, stations[j]-stations[j-1]);
            }

            max= Math.max(max, 2*(x-stations[n-1]));

            System.out.println(max);
        }
    }
}