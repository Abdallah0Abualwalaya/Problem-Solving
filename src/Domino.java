import java.util.Scanner;

public class Domino {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int M= scanner.nextInt();
        int N= scanner.nextInt();

        int result= (M*N)/2;
        System.out.println(result);
    }
}