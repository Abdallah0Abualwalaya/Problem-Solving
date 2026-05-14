import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int numberOfTestCases= scanner.nextInt();

        for(int i=1; i<=numberOfTestCases; i++){
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            if(a%b == 0){
                System.out.println(0);
            }
            else{
                System.out.println(b- (a%b));
            }
        }
    }
}