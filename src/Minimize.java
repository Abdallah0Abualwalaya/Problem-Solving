import java.util.Random;
import java.util.Scanner;

public class Minimize {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            Random random = new Random();
            int c = random.nextInt(b - a + 1) + a;
            System.out.println((c-a)+(b-c));
        }
    }
}