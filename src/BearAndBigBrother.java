import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int limak_weight= scanner.nextInt();
        int bob_weight= scanner.nextInt();
        int years= 0;

        while(bob_weight >= limak_weight){
            limak_weight *= 3;
            bob_weight *= 2;
            years++;
        }
        System.out.println(years);
    }
}