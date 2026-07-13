import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        for(int i=0; i<n; i++){
            int testCase= scanner.nextInt();

            if(testCase >= 1900){
                System.out.println("Division 1");
            }
            else if(testCase>=1600){
                System.out.println("Division 2");
            }
            else if(testCase>=1400){
                System.out.println("Division 3");
            }
            else{
                System.out.println("Division 4");
            }
        }
    }
}