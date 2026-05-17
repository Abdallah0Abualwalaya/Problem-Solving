import java.util.Scanner;

public class HitLottery {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        int[] bills= {100,20,10,5,1};
        int count= 0;

        for(int i=0; i< bills.length; i++){
            count += n/bills[i];
            n %= bills[i];
        }
        System.out.println(count);
    }
}