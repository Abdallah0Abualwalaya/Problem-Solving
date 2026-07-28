import java.util.Scanner;

public class LearnFromMath {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();

        if(n%2 == 0){
            System.out.println("4 " + (n-4));
        }
        else{
            System.out.println("9 " + (n-9));
        }
    }
}