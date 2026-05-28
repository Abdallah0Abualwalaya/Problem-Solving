import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int number= scanner.nextInt();
        int original= number;
        int reverse= 0;

        while(number > 0){
            int digit= number % 10; //getting last digit
            reverse= reverse * 10 + digit; //creating reverse numbers
            number /= 10; //deleting last digit
        }
        if(original == reverse){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}