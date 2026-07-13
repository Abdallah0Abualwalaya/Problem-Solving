import java.util.Scanner;

public class AB_Again {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            int twoDigits= scanner.nextInt();
            int firstDigit= twoDigits % 10;
            int secondDigit= (twoDigits / 10) % 10;
            System.out.println(firstDigit + secondDigit);
        }
    }
}