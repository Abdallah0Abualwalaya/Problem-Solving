import java.util.ArrayList;
import java.util.Scanner;

public class SumRoundNumbers {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();
        while(testCases-- > 0){
            int number= scanner.nextInt();
            ArrayList<Integer> roundNums= new ArrayList<>();
            int place= 1; //

            while(number > 0){
                int digit= number % 10; //getting last digit
                if(digit != 0){
                    roundNums.add(digit * place);
                }
                number /= 10; //deleting last digit
                place *= 10; //updating place of digit
            }
            System.out.println(roundNums.size());
            for(int i=0; i<roundNums.size(); i++){
                System.out.print(roundNums.get(i) + " ");
            }
            System.out.println();
        }
    }
}