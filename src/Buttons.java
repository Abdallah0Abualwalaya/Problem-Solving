import java.util.Scanner;

public class Buttons {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();
        for(int i=0; i<testCases; i++){
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            int c= scanner.nextInt();

            if(a + (c % 2) > b){
                System.out.println("First");
            }
            else{
                System.out.println("Second");
            }
        }
    }
}