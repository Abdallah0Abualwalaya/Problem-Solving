import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            int n= scanner.nextInt();
            int sum= 0;

            for(int j=0; j<n; j++){
                sum += scanner.nextInt();
            }

            if(sum %2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}