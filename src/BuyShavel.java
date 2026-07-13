import java.util.Scanner;

public class BuyShavel {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int k= scanner.nextInt();
        int r= scanner.nextInt();
        int n= 1;

        while(true){
            int lastDigit= (n*k) % 10;
            if(lastDigit==0 || lastDigit==r){
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}