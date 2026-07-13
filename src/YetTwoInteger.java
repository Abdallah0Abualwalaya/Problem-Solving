import java.util.Scanner;

public class YetTwoInteger {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            long a= scanner.nextLong();
            long b= scanner.nextLong();

            long diff= Math.abs(a - b);
            long moves= (diff + 9) / 10; //instead of Math.ceil

            System.out.println(moves);
        }
    }
}