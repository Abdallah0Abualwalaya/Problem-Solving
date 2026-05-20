import java.util.Scanner;

public class CandiesSisters {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int t_numberTestCases= scanner.nextInt();

        for(int i=0; i<t_numberTestCases; i++){
            long candies= scanner.nextLong();

            if(candies%2 ==0){
                System.out.println( (candies/2) - 1 );
            }
            else{
                System.out.println( candies/2 );
            }
        }
    }
}