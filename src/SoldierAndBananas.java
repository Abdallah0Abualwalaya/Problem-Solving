import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int k= scanner.nextInt(); //k: dollars should pay for w of bananas
        int n= scanner.nextInt(); //n: dollars soldier has
        int w= scanner.nextInt(); //w: number of bananas he wants to buy

        int price= 0;
        int total_price= 0; //int total_price = k * w * (w + 1) / 2; can replaced the loop with this line

        for(int i=1; i<=w; i++){
            price= i*k;
            total_price += price;
        }
        System.out.println(Math.max(0,total_price - n));
    }
}