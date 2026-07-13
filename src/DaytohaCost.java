import java.util.Scanner;

public class DaytohaCost {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            int n= scanner.nextInt();
            int k= scanner.nextInt();
            boolean found= false;

            for(int j=0; j<n; j++){
                int x= scanner.nextInt();
                if(x == k){
                    found= true;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }
    }
}