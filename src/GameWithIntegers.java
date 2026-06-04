import java.util.Scanner;

public class GameWithIntegers {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            int n= scanner.nextInt();
            if(n%3 == 0){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
    }
}